import Gestor.Archivo.*;
import Gestor.Empresarial.Contrato.Contrato;
import Gestor.Errores.GestionErrores;


import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        GestionErrores gestionErrores = new GestionErrores();

        Scanner sc = new Scanner(System.in);
        String opc;
        do {

            System.out.println("\t *****SYSTEM****** \n");
            System.out.println("\t Ingrese Usuario: ");
            String user = sc.nextLine();
            if (user.equals("Javier")) {
                System.out.println("\t Ingrese Contrasennia: \n");
                String password = sc.nextLine();
                if (password.equals("1234")) {

                } else {
                    String mensaje = gestionErrores.getErrorTecnico();
                }
            } else {
                System.out.println("Usuario Incorrecto ");
                String mensaje = gestionErrores.getErrorTecnico();
            }
            System.out.println("Desea Continuar? (S/N): \n");
            opc = sc.nextLine();

            // Crear objeto ArchivoTexto para manejar archivos de texto
            ArchivoTexto file1 = new ArchivoTexto("C:\\Users\\Javier\\OneDrive\\POO\\Proyecto-Final");
            String linea;

            // Escribir en el archivo
            file1.escribir("Descargado por: ");
            file1.escribir("Javier Lopez Rosete");
            file1.cerrar();

            // Abrir el archivo en modo lectura y leer cada línea
            file1.AbrirModoLectura();
            linea = file1.leer();
            while (linea != null) {
                System.out.println(linea);
                linea = file1.leer();
            }

            // Declarar variables para datos de contrato y opciones del menú
            int folio;
            int annio;
            int opcion = 1;

            // Crear objeto Contrato
            Contrato contrato1 = new Contrato();
            contrato1.setNoContrato(221803060);
            contrato1.setAnnio(2023);
            file1.cerrar();

            // Crear objeto Scanner para entrada de usuario
            Scanner scanner = new Scanner(System.in);
            while (opcion == 1) {
                // Mostrar menú de opciones
                System.out.println("Contratos   \n");
                System.out.println("Menu \n");
                System.out.println("1.Crear un nuevo contrato \n2.Salir");
                System.out.println("Ingrese la opcion deseada:");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("\nIngrese los datos");
                        // Crear nuevo contrato y solicitar datos al usuario
                        Contrato contrato2 = new Contrato();
                        System.out.println("\nIngrese el folio del contrato:");
                        folio = scanner.nextInt();
                        contrato2.setNoContrato(folio);
                        System.out.println("\nIngrese el annio del contrato");
                        annio = scanner.nextInt();
                        contrato2.setAnnio(annio);
                        // Obtener y mostrar los datos del contrato creado
                        int noContrato = contrato2.getNoContrato();
                        int anni = contrato2.getAnnio();
                        System.out.println("Número de contrato: " + noContrato);
                        System.out.println("Año: " + anni);
                        break;
                    case 2:
                        System.out.println("\nSaliendo de contratos...\n");
                        opcion = 2;
                        break;
                    default:
                        System.out.println("Opcion invalida....");
                }
            }
        } while ((opc.equals("S")) || (opc.equals("s"))) ;
    }
}




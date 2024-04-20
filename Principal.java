import Gestor.Archivo.*;
import Gestor.Empresarial.Contrato.Contrato;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        // Crear objeto ArchivoTexto para manejar archivos de texto
        ArchivoTexto file1 = new ArchivoTexto("C:\\Users\\karls\\OneDrive\\Documents\\Universidad\\5to cuatrimestre\\Enero-Abril2024\\ProyectoFinal");
        String linea;

        // Escribir en el archivo
        file1.escribir("Descargado por: ");
        file1.escribir("Karla Sarahi Solórzano Galván");
        file1.cerrar();

        // Abrir el archivo en modo lectura y leer cada línea
        file1.AbrirModoLectura();
        linea = file1.leer();
        while(linea != null){
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
        while (opcion == 1){
            // Mostrar menú de opciones
            System.out.println("Contratos   \n");
            System.out.println("Menu \n");
            System.out.println("1.Crear un nuevo contrato \n2.Salir");
            System.out.println("Ingrese la opcion deseada:");
            opcion = scanner.nextInt();
            switch (opcion){
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
    }
}

import Gestor.Archivo.ArchivoTexto;
import Gestor.Empresarial.Contrato.Contrato;
import java.util.*;

public class Pricipal_Contrato {
    public static void main(String[] args){
        // Declarar variables para datos de contrato y opciones del menú
        int folio;
        int annio;
        int opcion = 1;

        // Crear objeto Contrato
        Contrato contrato1 = new Contrato();
        contrato1.setNoContrato(221803060);
        contrato1.setAnnio(2023);

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

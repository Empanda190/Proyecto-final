import Gestor.Empresarial.Empleados.Empleados;

import java.util.Scanner;
import java.util.*;

public class Principal_Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        String nombre;
        String apellidos;
        String correo;
        int id;
        String adsc;

        do {
            System.out.println("Menú:");
            System.out.println("1. Datos personales");
            System.out.println("2. Datos empresariales");
            System.out.println("3. Contrato");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el nombre");
                    Empleados nuevo = new Empleados();
                    nombre = String.valueOf(scanner.nextInt());;

                    System.out.println("\nIngrese el apellido");
                    apellidos = String.valueOf(scanner.nextInt());;
                    nuevo.getInfoEmpleado(nombre,apellidos);

                    System.out.println("\nIngrese el correo");
                    correo = String.valueOf(scanner.nextInt());;

                    nuevo.addDatosPersonales(nombre,apellidos,correo);

                    break;
                case 2:
                    System.out.println("\nIngrese la adscripcion");
                    Empleados empresa = new Empleados();
                    adsc = String.valueOf(scanner.nextInt());;

                    System.out.println("\nIngrese el id");
                    id = scanner.nextInt();
                    empresa.setAdscripcion(id,adsc);

                    break;
                case 3:
                    //Pricipal_Contrato contratto= new Pricipal_Contrato();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

}

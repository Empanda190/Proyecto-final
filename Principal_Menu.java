import Gestor.Archivo.ArchivoTexto;
import Gestor.Empresarial.Empleados.Empleados;
import Gestor.Errores.GestionErrores;


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

        GestionErrores gestionErrores = new GestionErrores();

        Scanner sc = new Scanner (System.in);
        String opc;
        do {

            System.out.println("\t *****SYSTEM****** \n");
            System.out.println("\t Ingrese Usuario: ");
            String user =sc.nextLine();
            if(user.equals("Javier")){
                System.out.println("\t Ingrese Contrasennia: \n");
                String password =sc.nextLine();
                if (password.equals("1234")){

                }
                else {
                    String mensaje = gestionErrores.getErrorTecnico();
                }
            }
            else {
                System.out.println("Usuario Incorrecto ");
                String mensaje = gestionErrores.getErrorTecnico();
            }

            System.out.println("Desea Continuar? (S/N): \n");
            opc =sc.nextLine();
        }while ((opc.equals("n"))||(opc.equals("n")));


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
                    // Crear objeto ArchivoTexto para manejar archivos de texto
                    ArchivoTexto file1 = new ArchivoTexto("C:\\Users\\Javier\\OneDrive\\POO\\Proyecto-Final");
                    String linea;
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

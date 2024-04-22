import Gestor.Archivo.ArchivoTexto;
import Gestor.Empresarial.Contrato.Cargos;
import Gestor.Empresarial.Datos.DatosEmpresariales;
import Gestor.Empresarial.Empleados.Empleados;
import Gestor.Empresarial.Empresa.Empresa;
import Gestor.Errores.GestionErrores;


import java.util.Scanner;
import java.util.*;

public class Principal_Menu {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la clase Empresa
        Empresa empresa = new Empresa("EMT-SYSTEM.", "Javier Lopez Rosete");

        // Crear una instancia de la clase GestionErrores para manejar errores
        GestionErrores gestionErrores = new GestionErrores();

        // Crear un nuevo Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);
        String opc;

        // Bucle do-while para iniciar sesión
        do {
            System.out.println("\t ****SYSTEM***** \n");
            System.out.println("\t Ingrese Usuario: ");
            String user = sc.nextLine();

            if (user.equals("Javier")) {
                System.out.println("\t Ingrese Contraseña: \n");
                String password = sc.nextLine();

                if (password.equals("1234")) {
                    // Usuario y contraseña válidos
                } else {
                    String mensaje = gestionErrores.getDescripcionTecnica(2); // Obtener mensaje de error
                }
            } else {
                System.out.println("Usuario Incorrecto ");
                String mensaje = gestionErrores.getDescripcionTecnica(2); // Obtener mensaje de error
            }

            System.out.println("Desea Continuar? (S/N): \n");
            opc = sc.nextLine();
        } while (opc.equalsIgnoreCase("N"));

        boolean continuar = true;

        // Bucle do-while para mostrar el menú principal y gestionar las opciones del usuario
        do {
            System.out.println("1. Registro de una persona ");
            System.out.println("2. Registro de empleado");
            System.out.println("3. Asignar un contrato");
            System.out.println("4. Mostrar información del empleado");
            System.out.println("5. Mostrar información de la empresa");
            System.out.println("6. Mostrar información de contratos");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción por favor: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Utilizar una estructura switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    // Llamar al método para registrar un solicitante
                    registrarSolicitante(empresa);
                    break;
                case 2:
                    // Llamar al método para registrar un empleado
                    registrarEmpleado(empresa);
                    break;
                case 3:
                    // Llamar al método para asignar un contrato
                    asignarContrato(empresa);
                    break;
                case 4:
                    // Llamar al método para mostrar información de un empleado
                    mostrarInfoEmpleado(empresa);
                    break;
                case 5:
                    // Llamar al método para mostrar información de la empresa
                    mostrarInfoEmpresa(empresa);
                    break;
                case 6:
                    // Llamar al método para mostrar información de contratos
                    mostrarInfoContratos(empresa);
                    break;
                case 7:
                    // Salir del programa
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (continuar);
    }

    // Método para registrar un solicitante en la empresa
    private static void registrarSolicitante(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del solicitante al usuario
        System.out.println("Ingrese el nombre del solicitante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese los apellidos del solicitante:");
        String apellidos = scanner.nextLine();
        System.out.println("Ingrese el correo del solicitante:");
        String correo = scanner.nextLine();
        System.out.println("Ingrese el número de WhatsApp del solicitante:");
        String whatsapp = scanner.nextLine();

        // Agregar los datos del solicitante a la empresa y obtener el ID generado
        int idGenerado = empresa.datosRH.addDatosPersonales(nombre, apellidos, correo, whatsapp);
        if (idGenerado > 0) {
            System.out.println("Solicitante registrado con ID: " + idGenerado);
        } else {
            System.out.println("Error al registrar el solicitante.");
        }
    }

    // Método para registrar un empleado en la empresa
    private static void registrarEmpleado(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el ID del solicitante al usuario
        System.out.println("Ingrese el ID del solicitante:");
        int idSolicitante = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Obtener los datos del solicitante
        DatosEmpresariales datosSolicitante = empresa.datosRH.getDatosPersonales(idSolicitante);
        if (datosSolicitante != null) {
            // Mostrar la información del solicitante
            System.out.println("Información del solicitante:");
            System.out.println("Nombre: " + datosSolicitante.getNombre());
            System.out.println("Apellidos: " + datosSolicitante.getApellidos());
            System.out.println("Correo: " + datosSolicitante.getCorreo());
            System.out.println("WhatsApp: " + datosSolicitante.getWhatsApp());

            // Solicitar los datos empresariales del empleado al usuario
            System.out.println("Ingrese la descripción del empleado:");
            String adscripcion = scanner.nextLine();
            System.out.println("Ingrese el teléfono exterior del empleado:");
            String telefonoExterior = scanner.nextLine();
            System.out.println("Ingrese el puesto del empleado:");
            String puesto = scanner.nextLine();

            // Agregar los datos empresariales del empleado a la empresa
            empresa.datosRH.addDatosEmpresariales(idSolicitante, adscripcion, telefonoExterior, puesto);
            System.out.println("Empleado registrado exitosamente.");
        } else {
            System.out.println("No se encontró la persona que buscabas :c.");
        }
    }

    // Método para asignar un contrato a un empleado en la empresa
    private static void asignarContrato(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el ID del empleado al usuario
        System.out.println("Ingrese el ID del empleado:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Solicitar los detalles del contrato al usuario
        System.out.println("Ingrese el número de contrato:");
        int noContrato = scanner.nextInt();
        System.out.println("Ingrese el año:");
        int annio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el horario:");
        String horario = scanner.nextLine();
        System.out.println("Ingrese el tipo de cargo:");
        System.out.println("1. DE_CONFIANZA");
        System.out.println("2. SINDICALIZADO");
        System.out.println("3. TEMPORAL");
        int opcion = scanner.nextInt();
        Cargos tipoCargo;

        // Asignar el tipo de cargo según la opción seleccionada por el usuario
        switch (opcion) {
            case 1:
                tipoCargo = Cargos.DE_CONFIANZA;
                break;
            case 2:
                tipoCargo = Cargos.SINDICALIZADO;
                break;
            case 3:
                tipoCargo = Cargos.TEMPORAL;
                break;
            default:
                System.out.println("Opción no válida.");
                tipoCargo = Cargos.TEMPORAL; // Cargo por defecto
                break;
        }

        // Asignar el contrato al empleado en la empresa
        empresa.datosRH.addContrato(id, noContrato, annio, horario, tipoCargo);
        System.out.println("Contrato asignado.");
    }

    // Método para mostrar información de un empleado en la empresa
    private static void mostrarInfoEmpleado(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el ID del empleado al usuario
        System.out.println("Ingrese el ID del empleado:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Mostrar la información del empleado
        empresa.datosRH.showDatosEmpleado(id);
    }

    // Método para mostrar información de la empresa
    private static void mostrarInfoEmpresa(Empresa empresa) {
        // Mostrar la información de la empresa
        empresa.datosRH.showEmpresa();
    }

    // Método para mostrar información de los contratos de un empleado en la empresa
    private static void mostrarInfoContratos(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el ID del empleado al usuario
        System.out.println("Ingrese el ID del empleado:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Mostrar la información de los contratos del empleado
        empresa.datosRH.showContratosEmpleado(id);
    }
}

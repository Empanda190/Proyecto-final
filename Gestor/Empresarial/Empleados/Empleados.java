package Gestor.Empresarial.Empleados;
import Gestor.Empresarial.Datos.*;
import Gestor.Empresarial.Contrato.*;
import Gestor.Errores.GestionErrores;


public final class Empleados implements iEmpleados {
    // Atributos de la clase Empleados
    private DatosEmpresariales[] datosRH; // Array para almacenar datos empresariales de los empleados
    private Contrato[] contratosRH; // Array para almacenar contratos de los empleados
    public GestionErrores error; // Objeto para gestionar errores
    private int i; // Contador para el array de datos empresariales
    private int j; // Contador para el array de contratos

    // Constructor de la clase Empleados
    public Empleados() {
        this.i = 0;
        this.j = 0;
        datosRH = new DatosEmpresariales[100]; // Inicialización del array de datos empresariales
        contratosRH = new Contrato[100]; // Inicialización del array de contratos
        error = new GestionErrores(); // Inicialización del objeto para gestionar errores
    }

    // Método para agregar datos personales de un empleado
    public int addDatosPersonales(String nombre, String apellido, String correo, String whatsapp) {
        if (i < 100) {
            int id = i + 1; // Generación del ID
            // Creación de un nuevo objeto DatosEmpresariales y asignación de valores
            datosRH[i] = new DatosEmpresariales(id, nombre, apellido, correo, whatsapp);
            datosRH[i].setNombre(nombre);
            datosRH[i].setApellidos(apellido);
            datosRH[i].setCorreo(correo);
            datosRH[i].setWhatsApp(whatsapp);
            this.i++;
            System.out.println("ID: " + id);
            System.out.println("Datos Aspirante registrados");
            return id; // Retorno del ID generado
        } else {
            GestionErrores errores = new GestionErrores();
            errores.setNoError(2); // Definición de un código de error específico
            System.out.println(errores.getError(2)); // Mostrar el mensaje de error
        }
        return 0;
    }

    // Método para obtener el ID de un empleado
    public int getId(int id) {
        return this.i;
    }

    // Método para mostrar los datos personales de los empleados
    public void showDatosPersonales() {
        for (int a = 0; a < 1; a++) {
            System.out.println("Ingrese ID: " + datosRH[a].getId() +
                    "\nIngrese nombre: " + datosRH[a].getNombre() +
                    "\nIngrese Apellidos: " + datosRH[a].getApellidos() +
                    "\nIngrese correo: " + datosRH[a].getCorreo() +
                    "\n Ingrese whatsaap+" + datosRH[a].getWhatsApp());
        }
    }

    // Método para obtener los datos personales de un empleado
    public DatosEmpresariales getDatosPersonales(int id) {
        for (int a = 0; a < i; a++) {
            if (datosRH[a].getId() == id) {
                return datosRH[a];
            }
        }
        GestionErrores errores = new GestionErrores();
        errores.setNoError(3); // Definición de un código de error específico
        System.out.println(errores.getError(3)); // Mostrar el mensaje de error
        return null; // Retornar null si no se encuentra ningún empleado con el ID dado
    }

    // Método para agregar datos empresariales de un empleado
    public void addDatosEmpresariales(int id, String adscripcion, String telefonoExtension, String puesto) {
        DatosEmpresariales empleado = getDatosPersonales(id);
        if (empleado != null) { // Verificar si se encontró al empleado
            empleado.setAdscripcion(adscripcion);
            empleado.setTelefonoExtension(telefonoExtension);
            empleado.setPuesto(puesto);
            System.out.println("Se registraron los datos empresariales con éxito.");
        } else {
            GestionErrores errores = new GestionErrores();
            errores.setNoError(1); // Definición de un código de error específico
            System.out.println(errores.getError(1)); // Mostrar el mensaje de error
        }
    }

    // Método para mostrar los datos de un empleado
    public void showDatosEmpleado(int id) {
        boolean empleadoEncontrado = false;
        for (int a = 0; a < i; a++) {
            if (datosRH[a].getId() == id) {
                System.out.println("ID: " + datosRH[a].getId() +
                        "\nNombre: " + datosRH[a].getNombre() +
                        "\nApellidos: " + datosRH[a].getApellidos() +
                        "\nCorreo: " + datosRH[a].getCorreo() +
                        "\nWhatsApp: " + datosRH[a].getWhatsApp() +
                        "\nAdscripción: " + datosRH[a].getAdscripcion() +
                        "\nTeléfono de extensión: " + datosRH[a].getTelefonoExtension() +
                        "\nPuesto: " + datosRH[a].getPuesto() + "\n");
                empleadoEncontrado = true;
                break;
            }
        }
        if (!empleadoEncontrado) {
            System.out.println("Empleado con ID " + id + " no encontrado.");
        }
    }

    // Método para agregar un contrato a un empleado
    public void addContrato(int id, int noContrato, int annio, String horario, Cargos tipoCargo) {
        contratosRH[j] = new Contrato(id);
        if (this.j < 100) {
            contratosRH[j].setNoContrato(noContrato);
            contratosRH[j].setAnnio(annio);
            contratosRH[j].setHorario(horario);
            contratosRH[j].setTipoCargo(tipoCargo);
            this.j++;
        } else {
            GestionErrores errores = new GestionErrores();
            errores.setNoError(2); // Definición de un código de error específico
            System.out.println(errores.getError(2)); // Mostrar el mensaje de error
        }
    }

    // Método para mostrar los contratos de un empleado
    public void showContratoEmpleado(int n) {
        for (int a = 0; a < j; a++) {
            if (contratosRH[a] != null) {
                System.out.println("Ingrese ID del empleado: " + contratosRH[a].getId() +
                        "\nIngrese No.Contrato: " + contratosRH[a].getNoContrato() +
                        "\nIngrese Año: " + contratosRH[a].getAnnio() +
                        "\nIngrese horario: " + contratosRH[a].getHorario() +
                        "\nIngrese tipo de cargo:" + contratosRH[a].setTipoCargo());
            }
        }
    }

    // Método para mostrar información de la empresa
    public void showEmpresa() {
        System.out.println("Nombre de la empresa: EMT-SYSTEM");
        System.out.println("Representante Legal: Javier Lopez Rosete");
    }

    // Métodos de la interfaz iEmpleados que deben ser implementados
    @Override
    public String getInfoEmpleado(int id) {
        return null;
    }

    @Override
    public String getInfoEmpleado(String a) {
        return null;
    }

    // Método para obtener información de un empleado por nombre y apellidos
    public String getInfoEmpleado(String nombre, String apellidos) {
        for (int a = 0; a < i; a++) {
            if (datosRH[a].getNombre().equals(nombre)) {
                return "ID: " + datosRH[a].getId() +
                        "\nNombre: " + datosRH[a].getNombre() +
                        "\nApellidos: " + datosRH[a].getApellidos() +
                        "\nCorreo: " + datosRH[a].getCorreo() +
                        "\nWhatsApp: " + datosRH[a].getWhatsApp() +
                        "\nAdscripción: " + datosRH[a].getAdscripcion() +
                        "\nTeléfono de extensión: " + datosRH[a].getTelefonoExtension() +
                        "\nPuesto: " + datosRH[a].getPuesto();
            }
        }
        return "Empleado no encontrado.";
    }

    // Método para mostrar los datos de todos los empleados
    @Override
    public void showDatosEmpleados() {
        for (int a = 0; a < i; a++) {
            System.out.println("ID: " + datosRH[a].getId() +
                    "\nNombre: " + datosRH[a].getNombre() +
                    "\nApellidos: " + datosRH[a].getApellidos() +
                    "\nCorreo: " + datosRH[a].getCorreo() +
                    "\nWhatsApp: " + datosRH[a].getWhatsApp() +
                    "\nAdscripción: " + datosRH[a].getAdscripcion() +
                    "\nTeléfono de extensión: " + datosRH[a].getTelefonoExtension() +
                    "\nPuesto: " + datosRH[a].getPuesto() + "\n");
        }
    }

    // Método para mostrar los contratos de un empleado por ID
    @Override
    public void showContratosEmpleado(int id) {
        for (int a = 0; a < j; a++) {
            if (contratosRH[a].getId() == id) {
                System.out.println("ID del empleado: " + contratosRH[a].getId() +
                        "\nNo. Contrato: " + contratosRH[a].getNoContrato() +
                        "\nAño: " + contratosRH[a].getAnnio() +
                        "\nHorario: " + contratosRH[a].getHorario() +
                        "\nTipo de cargo: " + contratosRH[a].setTipoCargo() + "\n");
            }
        }
    }

    // Método para obtener la antigüedad de un empleado (no implementado)
    @Override
    public int getAntiguedad(int id) {
        return 0;
    }

    // Método para establecer la adscripción de un empleado (no implementado)
    public void setAdscripcion(int id, String adsc) {
    }
}
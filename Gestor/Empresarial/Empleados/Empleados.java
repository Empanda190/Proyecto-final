package Gestor.Empresarial.Empleados;
import Gestor.Empresarial.Datos.*;
import Gestor.Empresarial.Contrato.*;
import Gestor.Errores.GestionErrores;


public final class Empleados implements iEmpleados { //esta clase no ofrece herencia, solo instancia
    private DatosEmpresariales[] datosRH;
    private Contrato[] contratosRH;
    public GestionErrores error;
    private int i;
    private int j;


    public Empleados() {
        this.i = 0;
        this.j = 0;
        datosRH = new DatosEmpresariales[100];
        contratosRH = new Contrato[100];
        error = new GestionErrores();
    }
    public int addDatosPersonales(String nombre, String apellido, String correo, String whatsapp){
        if (i < 100){
            int id = i + 1; // Se genera el ID
            datosRH[i] = new DatosEmpresariales(id, nombre, apellido, correo, whatsapp);
            datosRH[i].setNombre(nombre);
            datosRH[i].setApellidos(apellido);
            datosRH[i].setCorreo(correo);
            datosRH[i].setWhatsApp(whatsapp);
            this.i++;
            System.out.println("ID: " + id);
            System.out.println("Datos Aspirante registrados");
            return id; // Se devuelve el ID generado
        }
        else {
            GestionErrores errores = new GestionErrores();
            errores.setNoError(2);
            System.out.println(errores.getError(2));
        }
        return 0;
    }
    public int getId(int id){
        return this.i;
    }
    public void showDatosPersonales(){
        for (int a=0; a<1; a++ ){
            System.out.println("Ingrese ID: " + datosRH[a].getId()+ "\n Ingrese nombre: "+datosRH[a].getNombre()+"\n Ingrese Apellidos: "+ datosRH[a].getApellidos()+"\nIngrese correo: "+ datosRH[a].getCorreo()+
                    "\n Ingrese whatsaap+"+ datosRH[a].getWhatsApp());
        }
    }
    public DatosEmpresariales getDatosPersonales(int id) {
        for (int a = 0; a < i; a++) {
            if (datosRH[a].getId() == id) {
                return datosRH[a];
            }
        }
        GestionErrores errores = new GestionErrores();
        errores.setNoError(3);
        System.out.println(errores.getError(3));
        return null; // Retorna null si no se encuentra ningún solicitante con el ID dado
    }
    public void addDatosEmpresariales(int id, String adscripcion, String telefonoExtension, String puesto) {
        DatosEmpresariales empleado = getDatosPersonales(id);
        if (empleado != null) { // Verificar si se encontró al empleado
            empleado.setAdscripcion(adscripcion);
            empleado.setTelefonoExtension(telefonoExtension);
            empleado.setPuesto(puesto);
            System.out.println("Se registraron los datos empresariales con éxito.");
        } else {
            GestionErrores errores = new GestionErrores();
            errores.setNoError(1); // Podrías definir un código de error específico
            System.out.println(errores.getError(1)); // Mostrar el mensaje de error
        }
    }
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
    public void addContrato(int id, int noContrato, int annio, String horario, Cargos tipoCargo){
        contratosRH[j] = new Contrato(id);
        if (this.j < 100){
            contratosRH[j].setNoContrato(noContrato);
            contratosRH[j].setAnnio(annio);
            contratosRH[j].setHorario(horario);
            contratosRH[j].setTipoCargo(tipoCargo);
            this.j++;
        }else {
            GestionErrores errores = new GestionErrores();
            errores.setNoError(2);
            System.out.println(errores.getError(2));
        }
    }
    public void showContratoEmpleado(int n){
        for(int a = 0; a<j; a++){
            if (contratosRH[a] != null){
                System.out.println("Ingrese ID del empleado: "+contratosRH[a].getId()+ "\nIngrese No.Contrato: "+ contratosRH[a].getNoContrato()+
                        "\nIngrese Año: "+ contratosRH[a].getAnnio()+"\nIngrese horario: "+ contratosRH[a].getHorario()+ "\nIngrese tipo de cargo:" + contratosRH[a].setTipoCargo());
            }
        }
    }
    public  void showEmpresa(){
        System.out.println("Nombre de la empresa: Itera S.A. de C.V.");
        System.out.println("RFC: RFC123456789");
        System.out.println("Telefono: 221353424");
        System.out.println("Representante Legal: Victor Zacatzontle");
    }
    @Override
    public String getInfoEmpleado(int id) {
        return null;
    }

    @Override
    public String getInfoEmpleado(String a) {
        return null;
    }

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

    @Override
    public int getAntiguedad(int id) {
        return 0;
    }

    public void setAdscripcion(int id, String adsc) {

    }
}
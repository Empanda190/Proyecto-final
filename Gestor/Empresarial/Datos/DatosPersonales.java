package Gestor.Empresarial.Datos;

// Clase abstracta que representa datos personales
public abstract class DatosPersonales {
    // Atributos de la clase DatosPersonales
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    // Método para obtener el identificador (id) del empleado
    public int getId() {
        return id;
    }

    // Método para establecer el identificador (id) del empleado
    public void setId(int id) {
        this.id = id;
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener los apellidos del empleado
    public String getApellidos() {
        return apellidos;
    }

    // Método para establecer los apellidos del empleado
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Método para obtener el correo electrónico del empleado
    public String getCorreo() {
        return correo;
    }

    // Método para establecer el correo electrónico del empleado
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para obtener el número de WhatsApp del empleado
    public String getWhatsApp() {
        return whatsapp;
    }

    // Método para establecer el número de WhatsApp del empleado
    public void setWhatsApp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}

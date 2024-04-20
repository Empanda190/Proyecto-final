package Gestor.Empresarial.Datos;

// Clase abstracta que representa datos personales
public class DatosPersonales {
    // Atributos
    int id; // Identificador único de la persona
    String nombre; // Nombre de la persona
    String apellidos; // Apellidos de la persona
    String correo; // Correo electrónico de la persona
    String whatsapp; // Número de WhatsApp de la persona

    // Métodos getter y setter para id
    protected int getId() {
        return id;
    }
    protected void setId(int id) {
        this.id = id;
    }

    // Métodos getter y setter para nombre
    protected String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para apellidos
    protected String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Métodos getter y setter para correo
    protected String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Métodos getter y setter para whatsapp
    protected String getWhatsapp() {
        return whatsapp;
    }
    protected void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}

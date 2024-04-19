package Gestor.Empresarial.Datos;

public abstract class DatosPersonales { //Esta clase ofrece herencia, no INSTANCIA
    int id;
    String nombre;
    String apellidos;
    String correo;
    String whatsapp;
    protected int getId() {
        return id;
    }
    protected void setId(int id) {
        this.id = id;
    }
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {

        this.nombre = nombre;
    }
    protected String getApellidos() {
        return apellidos;
    }
    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    protected String getCorreo() {
        return correo;
    }
    protected void setCorreo(String correo) {
        this.correo = correo;
    }
    protected String getWhatsapp() {
        return whatsapp;
    }
    protected void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}

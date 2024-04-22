package Gestor.Empresarial.Datos;

// Clase final que representa datos empresariales, hereda de DatosPersonales
public final class DatosEmpresariales extends DatosPersonales {
    // Atributos específicos de la clase DatosEmpresariales
    private String adscripcion;
    private String telefonoExtension;
    private String puesto;

    // Constructor de la clase DatosEmpresariales
    // Recibe parámetros correspondientes a la clase padre DatosPersonales y atributos adicionales
    public DatosEmpresariales(int id, String nombre, String apellidos, String correo, String whatsapp) {
        // Llama al constructor de la clase padre DatosPersonales para inicializar los atributos heredados
        super.setId(id);
        super.setNombre(nombre);
        super.setApellidos(apellidos);
        super.setCorreo(correo);
        super.setWhatsApp(String.valueOf(whatsapp));
    }

    // Método para obtener el identificador (id) del empleado
    @Override
    public int getId() {
        return super.getId();
    }

    // Método para obtener la adscripción del empleado
    public String getAdscripcion() {
        return adscripcion;
    }

    // Método para establecer la adscripción del empleado
    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    // Método para obtener el teléfono de extensión del empleado
    public String getTelefonoExtension() {
        return telefonoExtension;
    }

    // Método para establecer el teléfono de extensión del empleado
    public void setTelefonoExtension(String telefonoExtension) {
        this.telefonoExtension = telefonoExtension;
    }

    // Método para obtener el puesto del empleado
    public String getPuesto() {
        return puesto;
    }

    // Método para establecer el puesto del empleado
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}


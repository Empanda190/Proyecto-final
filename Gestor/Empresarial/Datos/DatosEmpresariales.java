package Gestor.Empresarial.Datos;

// Clase final que representa datos empresariales, hereda de DatosPersonales
public final class DatosEmpresariales extends DatosPersonales {
    // Atributos
    String adscripcion; // Variable para almacenar la adscripción del empleado
    String TelefonoExterior; // Variable para almacenar el teléfono exterior del empleado
    String puesto; // Variable para almacenar el puesto del empleado

    // Constructor
    // Constructor que inicializa los datos empresariales con los valores recibidos
    public DatosEmpresariales(){
        int a = 0; // Este valor no se utiliza en el constructor
    }

    // Métodos getter y setter para adscripcion
    public String getAdscripcion() {
        return adscripcion;
    }
    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    // Métodos getter y setter para TelefonoExterior
    public String getTelefonoExterior() {
        return TelefonoExterior;
    }
    public void setTelefonoExterior(String TelefonoExterior) {
        this.TelefonoExterior = TelefonoExterior;
    }

    // Métodos getter y setter para puesto
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}


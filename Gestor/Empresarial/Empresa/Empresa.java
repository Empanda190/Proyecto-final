// Importaciones de paquetes necesarios
package Gestor.Empresarial.Empresa;
import Gestor.Empresarial.Empleados.*; // Importar clases relacionadas con los empleados
import Gestor.Errores.*; // Importar clases relacionadas con los errores

// Definición de la clase Empresa
public final class Empresa { // Esta clase no ofrece herencia, solo instancia
    // Variables miembro de la clase
    private String nombreEmpresa;
    private String representanteLegal;
    public Empleados datosRH; // Objeto de la clase Empleados para gestionar los datos del recurso humano

    // Constructor de la clase Empresa
    public Empresa(String nombreEmpresa, String representanteLegal) {
        // Inicialización de variables en el constructor
        this.nombreEmpresa = nombreEmpresa;
        this.representanteLegal = representanteLegal;
        datosRH = new Empleados(); // Crear una instancia de la clase Empleados para manejar los datos del recurso humano
        // datosRH = ArregloInformacion.creandoInstanciaPrivada8349(); // ¿Comentar la utilización de este método?
    }

    // Método para obtener información de la empresa
    public String getInfo() {
        String datos = "";

        datos += "Representante Legal: " + this.representanteLegal + "\n";
        datos += "Empresa: " + this.nombreEmpresa + "\n";

        return datos;
    }

    // Método getter para obtener el nombre del representante legal de la empresa
    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    // Método setter para establecer el nombre del representante legal de la empresa
    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
}
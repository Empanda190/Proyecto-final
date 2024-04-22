package Gestor.Empresarial.Empresa;
import Gestor.Empresarial.Empleados.*;
import Gestor.Errores.*;

public final class Empresa { //esta clase no ofrece herencia, solo instancia
    private String nombreEmpresa;
    private String telefono;
    private String rfc;
    private String representanteLegal;
    public Empleados datosRH;

    public Empresa(String nombreEmpresa, String representanteLegal) {
        this.nombreEmpresa=nombreEmpresa;
        this.representanteLegal = representanteLegal;
        datosRH= new Empleados();
//        datosRH = ArregloInformacion.creandoInstanciaPrivada8349();
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInfo() {
        String datos="";

        datos += "Representante Legal: " + this.representanteLegal + "\n";
        datos += "Empresa: " + this.nombreEmpresa + "\n";

        return datos;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String repreentanteLegal) {
        this.representanteLegal = repreentanteLegal;
    }

}
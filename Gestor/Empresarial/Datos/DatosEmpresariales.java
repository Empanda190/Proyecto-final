package Gestor.Empresarial.Datos;

public final class DatosEmpresariales extends DatosPersonales{ //final solo ofrece instancia no herencia
    String adscripcion;
    String TelefonoExterior;
    String puesto;
    public DatosEmpresariales(int a, String b,String c, String d){
        a =0;
    }
    public String getAdscripcion() {
        return adscripcion;
    }
    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }
    public String getTelefonoExterior() {
        return TelefonoExterior;
    }
    public void setTelefonoExterior(String TelefonoExterior) {
        this.TelefonoExterior = TelefonoExterior;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

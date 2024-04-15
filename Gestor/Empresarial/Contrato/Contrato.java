
package Gestor.Empresarial.Contrato;
import Gestor.Empresarial.Contrato.*;
public final class Contrato {
    int id;
    int NoContrato;
    int annio;
    String horario;
    Cargos TipoCargo;
    public Contrato(int id){
//poner algo
    }
    public int getNoContrato() {
        return NoContrato;
    }
    public void setNoContrato(int a) {
        NoContrato = a;
    }
    public int getAnnio() {
        return annio;
    }
    public void setAnnio(int b) {
        this.annio = b;
    }
}

package Gestor.Errores;
import java.util.*;

public final class GestionErrores {
    Map<Integer,String> error;
    private boolean ExisteError;
    private int NoError;
    private String DescripcionTecnica;
    public GestionErrores(){
        //HashMap obtiene herencia de Map, map fue echa para ser heredable
        //tema de collection
        error = new HashMap<Integer, String>();
    }
    private void CargarErrores(){
        //...
    }
    public void setNoError(int noError) {
        NoError = noError;
    }
    public String getError(){
        return "p";
    }
    public String getErrorTecnico(){
        return "r";
    }
    public boolean ExisteError(){
        return true;
    }
}
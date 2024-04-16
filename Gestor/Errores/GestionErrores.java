package Gestor.Errores;
import Gestor.Archivo.*;
import java.util.*;

public final class GestionErrores {
    Map<Integer,String> error;
    private boolean ExisteError;
    private int NoError;
    private String DescripcionTecnica;
    private String[] listaErrores=new String[10]; //Creamos la lista
    private ArchivoTexto archivo; //Creamos el objeto

    public GestionErrores(){
        //HashMap obtiene herencia de Map, map fue echa para ser heredable
        //tema de collection
        error = new HashMap<Integer, String>();
        archivo=new ArchivoTexto("C:\\archivos\\errores.txt");

        listaErrores[0]="Empleado no identificado";
        listaErrores[1]="Acceso Denegado";
        listaErrores[2]="Contraseña Errónea";
        listaErrores[3]="Empleado no encontrado al momento de registrar su contrato";
        listaErrores[4]="Empleado no encontrado al momento de buscar un contrato";
    }
    private void CargarErrores(){
        //...
    }
    public void setNoError(int noError) {
        NoError = noError;
    }
    public String getError(int id){
        archivo.AbrirModoEscritura();
        archivo.escribir(listaErrores[id]);
        archivo.cerrar();
        return listaErrores[id];
    }
    public String getErrorTecnico(){
        return "r";
    }
    public boolean ExisteError(){
        return true;
    }
}
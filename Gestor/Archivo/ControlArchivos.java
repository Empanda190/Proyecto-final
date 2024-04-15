package Gestor.Archivo;

public abstract class ControlArchivos {
    //abstract obliga solo tener herencia
    private String archivo;
    public ControlArchivos(String a) {
        //aqui instanciamos
    }
    public boolean crear(){
        return true;
    }
    public boolean eliminar(){
        return false;
    }
    public boolean cambiar(){
        return true;
    }
    public boolean mover(String a){
        return false;
    }
}

package Gestor.Archivo;
import Gestor.Archivo.iFileText;
import java.io.*;

public final class ArchivoTexto extends ControlArchivos implements iFileText {
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean ArchivoTexto;
    private boolean ModoLectura;
    private boolean ModoEscritura;

    //Estos metodos son de la interaz
    public void AbrirModoLectura(){
        /*Aquí va algo*/
    }
    public String leer(){
        return "a";
    }
    public void AbrirModoEscritura(){
        /*Aquí va algo*/
    }
    public void escribir(String a){
        /*Aquí va algo*/
    }
    public void cerrar(){
        /*Aquí va algo*/
    }
    //Metodos de la clase
    public ArchivoTexto(String a) {
        //instanciar de la clase base
        super(a);
    }
    public ArchivoTexto(String a, boolean b){
        //instanciar de la clase base
        super(a);
    }
}
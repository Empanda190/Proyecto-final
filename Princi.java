import Gestor.Archivo.*;
public class Princi {
    public static void main(String[] args){
        ArchivoTexto obj= new ArchivoTexto("Archivo1");

        obj.AbrirModoEscritura();
        obj.escribir("Escribiendo");
        obj.cerrar();
    }
}

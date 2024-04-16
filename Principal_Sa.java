import Gestor.Archivo.*;
public class Principal_Sa {
    public static void main(String[] args){
        ArchivoTexto file1 = new ArchivoTexto("C:\\Users\\karls\\OneDrive\\Documents\\Universidad\\5to cuatrimestre\\Enero-Abril2024\\ProyectoFinal");
        String linea;

        file1.escribir("Descargado por: ");
        file1.escribir("Karla Sarahi Solórzano Galván");
        file1.cerrar();

        file1.AbrirModoLectura();
        linea = file1.leer();

        while(linea !=null){
            System.out.println(linea);
            linea=file1.leer();
        }
        file1.cerrar();
    }
}

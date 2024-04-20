package Gestor.Archivo;
import java.io.*;

public abstract class ControlArchivos {
    //abstract obliga solo tener herencia
    private String archivo;
    public ControlArchivos(String nombre) {
        //aqui instanciamos
        this.archivo = nombre;
    }
    public boolean crear(){
        try {
            File file = new File(this.archivo);
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + this.archivo);
                return true;
            } else {
                System.out.println("El archivo ya existe.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Error al intentar crear el archivo: " + e.getMessage());
            return false;
        }
    }
    public boolean eliminar(){
        File file = new File(this.archivo);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Archivo eliminado: " + this.archivo);
                return true;
            } else {
                System.out.println("No se pudo eliminar el archivo.");
                return false;
            }
        } else {
            System.out.println("El archivo no existe.");
            return false;
        }
    }

    public boolean cambiar(String NuevoNombre){ //cambiar el nombre
        File file = new File(this.archivo);
        File nuevoArchivo = new File(NuevoNombre);
        if (file.exists()) {
            if (file.renameTo(nuevoArchivo)) {
                System.out.println("Nombre del archivo cambiado a: " + NuevoNombre);
                this.archivo = NuevoNombre;
                return true;
            } else {
                System.out.println("No se pudo cambiar el nombre del archivo.");
                return false;
            }
        } else {
            System.out.println("El archivo no existe.");
            return false;
        }
    }
    public boolean mover(String NuevaUbicacion){
        File file = new File(this.archivo);
        File nuevaRuta = new File(NuevaUbicacion + File.separator + file.getName());
        if (file.exists()) {
            if (file.renameTo(nuevaRuta)) {
                System.out.println("Archivo movido a: " + nuevaRuta.getAbsolutePath());
                this.archivo = nuevaRuta.getAbsolutePath();
                return true;
            } else {
                System.out.println("No se pudo mover el archivo.");
                return false;
            }
        } else {
            System.out.println("El archivo no existe.");
            return false;
        }
    }
}

package Gestor.Archivo;
import java.io.*;

import java.io.*;

public abstract class ControlArchivos {
    // Clase abstracta para controlar archivos

    // Nombre del archivo
    private String archivo;

    // Constructor para inicializar el nombre del archivo
    public ControlArchivos(String nombre) {
        // Instanciamos la clase con el nombre del archivo
        this.archivo = nombre;
    }

    // Método para crear un nuevo archivo
    public boolean crear(){
        try {
            File file = new File(this.archivo);
            // Intentamos crear el archivo
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + this.archivo);
                return true;
            } else {
                System.out.println("El archivo ya existe.");
                return false;
            }
        } catch (IOException e) {
            // Manejo de excepciones si ocurre un error al intentar crear el archivo
            System.out.println("Error al intentar crear el archivo: " + e.getMessage());
            return false;
        }
    }

    // Método para eliminar un archivo existente
    public boolean eliminar(){
        File file = new File(this.archivo);
        if (file.exists()) {
            // Verificamos si el archivo existe antes de intentar eliminarlo
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

    // Método para cambiar el nombre del archivo
    public boolean cambiar(String NuevoNombre){
        File file = new File(this.archivo);
        File nuevoArchivo = new File(NuevoNombre);
        if (file.exists()) {
            // Verificamos si el archivo existe antes de intentar cambiar su nombre
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

    // Método para mover el archivo a una nueva ubicación
    public boolean mover(String NuevaUbicacion){
        File file = new File(this.archivo);
        File nuevaRuta = new File(NuevaUbicacion + File.separator + file.getName());
        if (file.exists()) {
            // Verificamos si el archivo existe antes de intentar moverlo
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

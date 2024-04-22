package Gestor.Archivo;
import java.io.File;

public abstract class ControlArchivos {
    protected String archivo; // Nombre del archivo

    // Constructor de la clase ControlArchivos
    public ControlArchivos(String archivo) {
        this.archivo = archivo;
    }

    // Método abstracto para crear el archivo (debe ser implementado por las clases hijas)
    public abstract boolean Crear();

    // Método para eliminar el archivo
    public boolean Eliminar() {
        File file = new File(archivo); // Crea un objeto File con el nombre del archivo
        if (file.exists()) { // Verifica si el archivo existe
            return file.delete(); // Elimina el archivo y devuelve true si se elimina correctamente
        }
        return false; // Devuelve false si el archivo no existe o no se puede eliminar
    }

    // Método para cambiar el nombre del archivo
    public boolean Cambiar(String nuevoNombre) {
        File file = new File(archivo); // Crea un objeto File con el nombre del archivo actual
        if (file.exists()) { // Verifica si el archivo existe
            File nuevoArchivo = new File(nuevoNombre); // Crea un objeto File con el nuevo nombre
            return file.renameTo(nuevoArchivo); // Cambia el nombre del archivo y devuelve true si se cambia correctamente
        }
        return false; // Devuelve false si el archivo no existe o no se puede cambiar el nombre
    }

    // Método para mover el archivo a un nuevo directorio
    public boolean Mover(String nuevoDirectorio) {
        File file = new File(archivo); // Crea un objeto File con el nombre del archivo
        if (file.exists()) { // Verifica si el archivo existe
            File nuevoDirectorioFile = new File(nuevoDirectorio); // Crea un objeto File con el nuevo directorio
            if (!nuevoDirectorioFile.exists()) { // Verifica si el nuevo directorio no existe
                if (nuevoDirectorioFile.mkdirs()) { // Intenta crear el nuevo directorio
                    // Si se crea correctamente, mueve el archivo al nuevo directorio y devuelve true
                    return file.renameTo(new File(nuevoDirectorioFile, file.getName()));
                }
            } else {
                // Si el nuevo directorio ya existe, simplemente mueve el archivo al nuevo directorio y devuelve true
                return file.renameTo(new File(nuevoDirectorioFile, file.getName()));
            }
        }
        return false; // Devuelve false si el archivo no existe o no se puede mover
    }
}

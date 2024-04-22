package Gestor.Archivo;
import Gestor.Archivo.iFileText;
import java.io.*;

import java.io.*;

public final class ArchivoTexto extends ControlArchivos implements iFileText {
    // Variables de instancia
    private File file; // Referencia al archivo
    private FileReader fr; // Objeto para lectura de archivos de texto
    private BufferedReader br; // Objeto para lectura de archivos de texto en modo buffer
    private FileWriter fw; // Objeto para escritura de archivos de texto
    private BufferedWriter bw; // Objeto para escritura de archivos de texto en modo buffer
    private boolean archivoExiste; // Indica si el archivo existe
    private boolean modoLectura; // Indica si el archivo está abierto en modo lectura
    private boolean modoEscritura; // Indica si el archivo está abierto en modo escritura

    // Constructor de la clase ArchivoTexto
    public ArchivoTexto(String tituloArchivo) {
        super(tituloArchivo); // Llama al constructor de la clase padre ControlArchivos
        try {
            file = new File(tituloArchivo);

            // Verifica si el archivo no existe y lo crea
            if (!file.exists())
                file.createNewFile();

            // Establece el estado del archivo
            this.archivoExiste = true;
            this.modoLectura = false;
            this.modoEscritura = false;
        } catch (Exception e) {
            // Manejo de excepción en caso de error al buscar o crear el archivo
            System.out.println("Error al intentar buscar el archivo");
            this.archivoExiste = false;
        }
    }

    // Método para crear el archivo
    @Override
    public boolean Crear() {
        if (file != null) {
            try {
                if (!file.exists()) {
                    file.createNewFile(); // Crea el archivo si no existe
                    archivoExiste = true;
                    return true;
                }
            } catch (IOException e) {
                // Manejo de excepción en caso de error al crear el archivo
                System.out.println("Error al crear el archivo");
                archivoExiste = false;
            }
        }
        return false;
    }

    // Constructor adicional para la clase ArchivoTexto (no utilizado en este código)
    public ArchivoTexto(String tituloArchivo, boolean nuevo) {
        super(tituloArchivo);
    }

    // Método para abrir el archivo en modo lectura
    public void AbrirModoLectura() {
        if (archivoExiste == true) {
            try {
                // Abre el archivo para lectura
                fr = new FileReader(this.file.getAbsoluteFile());
                br = new BufferedReader(this.fr);
                this.modoLectura = true;
                System.out.println("Archivo abierto en modo lectura");
            } catch (Exception e) {
                // Manejo de excepción en caso de error al abrir el archivo en modo lectura
                System.out.println("Error: El archivo no se puede abrir en modo lectura");
            }
        }
    }

    @Override
    public String leer() {
        return null;
    }

    // Método para leer una línea del archivo
    public String Leer() {
        if (archivoExiste == true) {
            try {
                return this.br.readLine(); // Lee una línea del archivo y la devuelve
            } catch (Exception e) {
            }
        }
        return null;
    }

    // Método para leer y mostrar todas las líneas del archivo
    public void Leer2() {
        if (archivoExiste == true) {
            try {
                int i = 1;
                String linea = this.br.readLine(); // Lee la primera línea del archivo

                // Lee y muestra todas las líneas del archivo
                while (linea != null) {
                    System.out.println(i + ".- " + linea);
                    linea = this.br.readLine(); // Lee la siguiente línea del archivo
                    i++;
                }
            } catch (Exception e) {
                // Manejo de excepción en caso de error al leer el archivo
                System.out.println("Error: No se puede extraer información del archivo");
            }
        }
    }

    // Método para abrir el archivo en modo escritura
    public void AbrirModoEscritura() {
        if (archivoExiste == true) {
            try {
                // Abre el archivo para escritura
                fw = new FileWriter(this.file.getAbsoluteFile(), true);
                bw = new BufferedWriter(this.fw);
                modoEscritura = true;
                System.out.println("Archivo abierto en modo escritura");
            } catch (Exception e) {
                // Manejo de excepción en caso de error al abrir el archivo en modo escritura
                System.out.println("Error: El archivo no se puede abrir en modo escritura");
            }
        }
    }

    @Override
    public void escribir(String a) {

    }

    @Override
    public void cerrar() {

    }

    // Método para escribir en el archivo
    public void Escribir(String texto) {
        if (archivoExiste == true) {
            try {
                this.bw.write(texto + "\n"); // Escribe el texto en el archivo seguido de un salto de línea
            } catch (Exception e) {
                // Manejo de excepción en caso de error al escribir en el archivo
                System.out.println("Error: No se puede escribir información en el archivo");
            }
        }
    }

    // Método para cerrar el archivo
    public void Cerrar() {
        if (modoEscritura == true) {
            try {
                this.bw.close(); // Cierra el BufferedWriter
                this.fw.close(); // Cierra el FileWriter
            } catch (Exception e) {
            }
        } else if (modoLectura == true) {
            try {
                this.br.close(); // Cierra el BufferedReader
                this.fr.close(); // Cierra el FileReader
            } catch (Exception e) {
            }
        }
    }
}

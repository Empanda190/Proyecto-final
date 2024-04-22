package Gestor.Errores;


import java.io.*;
import Gestor.Archivo.*;
import java.util.HashMap;
import java.util.Map;

// Clase final para gestionar errores
public final class GestionErrores {
    // Atributos
    private Map<Integer, String> error; // Mapa que almacena los códigos de error y sus descripciones
    private boolean ExisteError; // Indica si existe un error
    private int NoError; // Número de error actual
    private String DescripcionTecnica; // Descripción técnica del error
    private String[] listaErrores = new String[10]; // Arreglo para almacenar descripciones de errores
    private ArchivoTexto archivo; // Objeto para manejar archivos de texto

    // Constructor
    public GestionErrores(){
        // Inicializamos el mapa de errores
        error = new HashMap<>();

        // Inicializamos el objeto para manejar archivos de texto
        archivo = new ArchivoTexto("C:\\Users\\karls\\OneDrive\\Documents\\Universidad\\5to cuatrimestre\\Enero-Abril2024\\Proyecto_Final");

        // Inicializamos las descripciones de errores predefinidas
        listaErrores[0] = "Empleado no identificado";
        listaErrores[1] = "Usuario no encontrado";
        listaErrores[2] = "Contraseña Errónea";
        listaErrores[3] = "Empleado no encontrado al momento de registrar su contrato";
        listaErrores[4] = "Empleado no encontrado al momento de buscar un contrato";
        listaErrores[5] = "Acceso Denegado";
        listaErrores[6] = "Error al crear el archivo";
        listaErrores[7] = "Error al editar el archivo";
    }

    // Método privado para cargar descripciones de errores desde un archivo
    private void CargarErrores(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ruta_del_archivo.txt")); // Abrir archivo
            String linea;
            int contador = 0;
            // Leer cada línea del archivo y almacenarla en el arreglo de errores
            while ((linea = reader.readLine()) != null) {
                listaErrores[contador] = linea;
                contador++;
                if (contador >= listaErrores.length) {
                    break; // Evitar desbordamiento del arreglo
                }
            }
            reader.close(); // Cerrar archivo
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de errores: " + e.getMessage()); // Manejar excepciones
        }
    }

    // Método para establecer el número de error
    public void setNoError(int noError) {
        NoError = noError;
    }

    // Método para obtener la descripción de un error dado su código y escribirlo en un archivo
    public String getError(int id){
        archivo.AbrirModoEscritura(); // Abrir archivo en modo escritura
        archivo.escribir(listaErrores[id]); // Escribir descripción del error en el archivo
        archivo.cerrar(); // Cerrar archivo
        return listaErrores[id]; // Devolver descripción del error
    }

    // Método para obtener la descripción técnica del error
    public String getErrorTecnico(){
        return DescripcionTecnica;
    }

    // Método para verificar si existe un error
    public boolean ExisteError(){
        return ExisteError;
    }


    public String getDescripcionTecnica(int i) {
        return null;
    }
}

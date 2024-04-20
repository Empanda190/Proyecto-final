package Gestor.Errores;
import java.util.HashMap;
import java.util.Map;

// Clase final que gestiona los errores
public final class Errores {
    // Mapa que almacena los códigos de error y sus descripciones
    private final Map<Integer, String> error;
    private boolean existeError; // Bandera que indica si existe un error
    private int noError; // Número de error actualmente manejado
    private final String[] listaErrores = new String[10]; // Arreglo para almacenar las descripciones de los errores

    // Constructor
    public Errores() {
        error = new HashMap<>();

        // Llenar el mapa con los códigos de error y sus descripciones
        for (int i = 0; i < listaErrores.length; i++) {
            error.put(i, listaErrores[i]);
        }
    }

    // Método para obtener la descripción de un error dado su código
    public String getError(int codigoError) {
        if (codigoError < 0 || codigoError >= listaErrores.length) {
            return "Error: Código de error inválido";
        }
        return error.get(codigoError);
    }

    // Método para establecer la descripción de un error dado su código
    public void setError(int codigoError, String descripcionError) {
        if (codigoError < 0 || codigoError >= listaErrores.length) {
            System.out.println("Error: Código de error inválido");
            return;
        }
        error.put(codigoError, descripcionError);
    }

    // Método para validar y manejar un error dado su código
    public void validarError(int codigoError) {
        // Verificar si el código de error es válido
        if (codigoError < 0 || codigoError >= listaErrores.length) {
            System.out.println("Error: Código de error inválido");
            return;
        }

        // Obtener la descripción del error
        String descripcionError = error.get(codigoError);

        // Manejar el error de acuerdo a su código
        switch (codigoError) {
            case 0:
                System.out.println("Error 0" + codigoError + ": " + descripcionError);
                // Llamar a una función específica para manejar este error si es necesario
                // funcionParaError0();
                break;
            case 1:
                System.out.println("Error 1" + codigoError + ": " + descripcionError);
                // funcionParaError1();
                break;
            case 2:
                System.out.println("Error 2" + codigoError + ": " + descripcionError);
                // funcionParaError2();
                break;
            case 3:
                System.out.println("Error 3" + codigoError + ": " + descripcionError);
                // funcionParaError3();
                break;
            case 4:
                System.out.println("Error 4" + codigoError + ": " + descripcionError);
                // funcionParaError4();
                break;
            case 5:
                System.out.println("Error 5" + codigoError + ": " + descripcionError);
                // funcionParaError5();
                break;
            case 6:
                System.out.println("Error 6" + codigoError + ": " + descripcionError);
                // funcionParaError6();
                break;
            case 7:
                System.out.println("Error 7" + codigoError + ": " + descripcionError);
                // funcionParaError7();
                break;
            // Agregar casos para otros códigos de error si es necesario
            default:
                System.out.println("Error " + codigoError + ": " + descripcionError);
                break;
        }
    }
}
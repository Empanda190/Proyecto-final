package Gestor.Errores;
import java.util.HashMap;
import java.util.Map;

public final class Errores {
    private final Map<Integer, String> error;
    private boolean existeError;
    private int noError;
    private final String[] listaErrores = new String[10]; // Creamos la lista

    public Errores() {
        error = new HashMap<>();
        //archivo=new
        // Llenar el mapa con los códigos de error y sus descripciones
        for (int i = 0; i < listaErrores.length; i++) {
            error.put(i, listaErrores[i]);
        }
    }
    public String getError(int codigoError) {
        if (codigoError < 0 || codigoError >= listaErrores.length) {
            return "Error: Código de error inválido";
        }

        return error.get(codigoError);
    }


    public void setError(int codigoError, String descripcionError) {
        if (codigoError < 0 || codigoError >= listaErrores.length) {
            System.out.println("Error: Código de error inválido");
            return;
        }

        error.put(codigoError, descripcionError);
    }

    public void validarError(int codigoError) {

        if (codigoError < 0 || codigoError >= listaErrores.length) {
            System.out.println("Error: Código de error inválido");
            return;
        }

        String descripcionError = error.get(codigoError);

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
                // funcionParaError2();
                break;
            case 4:
                System.out.println("Error 4" + codigoError + ": " + descripcionError);
                // funcionParaError2();
                break;
            case 5:
                System.out.println("Error 5" + codigoError + ": " + descripcionError);
                // funcionParaError2();
                break;
            // Agregar casos para otros códigos de error si es necesario
            default:
                System.out.println("Error  " + codigoError + ": " + descripcionError);
                break;
        }
    }
}
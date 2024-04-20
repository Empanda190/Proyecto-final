package Gestor.Empresarial.Contrato;
import Gestor.Errores.*;

import java.util.ArrayList;
import java.util.List;

// Clase final que representa un contrato
public final class Contrato {
    // Atributos
    int id; // Identificador del contrato (no utilizado en el constructor)
    int NoContrato; // Número de contrato
    int annio; // Año del contrato
    String horario; // Horario del contrato
    Cargos TipoCargo; // Tipo de cargo del contrato
    private GestionErrores error; // Objeto para gestionar errores
    private static List<Contrato> contratos = new ArrayList<>(); // Lista estática para almacenar todos los contratos

    // Constructor
    public Contrato() {
        error = new GestionErrores(); // Inicializar objeto para gestionar errores
    }

    // Métodos getter y setter para NoContrato
    public int getNoContrato() {
        return NoContrato;
    }

    public void setNoContrato(int a) {
        NoContrato = a;
    }

    // Métodos getter y setter para annio
    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int b) {
        this.annio = b;
    }

    // Método para agregar un contrato a la lista
    public void agregarContrato(Contrato contrato) {
        contratos.add(contrato); // Agregar contrato a la lista
    }

    // Método para obtener todos los contratos almacenados
    public static List<Contrato> obtenerContratos() {
        return contratos; // Devolver la lista de contratos
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setTipoCargo(Cargos tipoCargo) {
    }
}
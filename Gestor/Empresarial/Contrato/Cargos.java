package Gestor.Empresarial.Contrato;

public enum Cargos {
    // Enumeración de los cargos disponibles
    CONFIAZA("Cargo de Confianza"), // Cargo de confianza
    SINDICALIZADO("Cargo Sindicalizado"), // Cargo sindicalizado
    TEMPORAL("Cargo Temporal"); // Cargo temporal

    // Atributo para almacenar la descripción del cargo
    private String descripcion;

    // Constructor privado para inicializar la descripción del cargo
    private Cargos(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para obtener la descripción del cargo
    public String getDescripcion() {
        return descripcion;
    }
    public void setTipoCargo(Cargos tipoCargo) {
        this.descripcion = String.valueOf(tipoCargo);
    }

    public Cargos getTipoCargo(Cargos tipoCargo) {
        return tipoCargo;
    }
}


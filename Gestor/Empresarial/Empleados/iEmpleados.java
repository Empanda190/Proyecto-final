package Gestor.Empresarial.Empleados;

public interface iEmpleados {
    // Interfaz que define los métodos relacionados con la gestión de empleados

    // Método para obtener información de un empleado por su ID
    String getInfoEmpleado(int id);

    // Método para obtener información de un empleado por su nombre
    String getInfoEmpleado(String nombre);

    // Método para mostrar los datos de todos los empleados
    void showDatosEmpleados();

    // Método para mostrar los contratos de un empleado por su ID
    void showContratosEmpleado(int id);

    // Método para obtener la antigüedad de un empleado por su ID
    int getAntiguedad(int id);
}

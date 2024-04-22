package Gestor.Archivo;

public interface iFileText {
      // Método para abrir el archivo en modo lectura
      public void AbrirModoLectura();

      // Método para leer una línea del archivo
      public String leer();

      // Método para abrir el archivo en modo escritura
      public void AbrirModoEscritura();

      // Método para escribir en el archivo
      public void escribir(String a);

      // Método para cerrar el archivo
      public void cerrar();
}


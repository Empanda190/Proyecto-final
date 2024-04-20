package Gestor.Archivo;

public interface iFileText {
      public void AbrirModoLectura();
      public String leer();
      public void AbrirModoEscritura();
      public void escribir (String a);
      public void cerrar();
}

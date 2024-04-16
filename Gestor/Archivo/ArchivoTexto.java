package Gestor.Archivo;
import Gestor.Archivo.iFileText;
import java.io.*;

public final class ArchivoTexto extends ControlArchivos implements iFileText {
    private File file;
    private FileReader fr;
    private BufferedReader br; // leer el archivo
    private FileWriter fw; // prepara el archivo para escritura
    private BufferedWriter bw; //buffer es un fragmento pequeño de memoria, guarda lo que sea
    private boolean ArchivoExiste;
    private boolean ModoLectura;
    private boolean ModoEscritura;

    //Estos metodos son de la interaz
    public void AbrirModoLectura(){
        if (ArchivoExiste==true) {
            try {
                fr = new FileReader(this.file.getAbsoluteFile());
                br = new BufferedReader(this.fr);
                this.ModoEscritura=true;
                System.out.println("Archivo abierto en modo lectura");

            }
            catch(FileNotFoundException e) {
                System.out.println("Error específico: El archivo no se puede abrir en modo lectura: ***" + e.getMessage() + "***");
            }
            catch (Exception e) {
                System.out.println("Error Generico: El archivo no se puede abrir en modo lectura: ***" + e.getMessage() + "***");
            }
        }
    }
    public String leer(){
        if (ArchivoExiste==true) {
            try {
                return this.br.readLine();
            }
            catch (Exception e) {
            }
        }
        return null;
    }

    public void leer2(){
        if (ArchivoExiste==true) {
            try {
                int i = 1;
                String linea = this.br.readLine();

                while (linea != null) {
                    System.out.println(i + ".- " + linea);
                    linea = this.br.readLine();
                    i++;
                }
            } catch (Exception e) {
                System.out.println("Error: No se puede extraer información del archivo");
            }
        }
    }

    public void AbrirModoEscritura(){
        if (ArchivoExiste==true) {
            try {
                fw = new FileWriter(this.file.getAbsoluteFile(),true);
                bw = new BufferedWriter(this.fw);
                ModoEscritura=true;
                System.out.println("Archivo abierto en modo escritura");
            } catch (Exception e) {
                System.out.println("Error: El archivo no se puede abrir en modo escritura");
            }
        }
    }
    public void escribir(String a){
        if (ArchivoExiste==true) {
            try {
                this.bw.write("texto"+"\n");
            } catch (Exception e) {
                System.out.println("Error: No se puede escribir información en el archivo");
            }
        }
    }
    public void cerrar(){
        if (ModoEscritura==true){
            try {
                this.bw.close();
                this.fw.close();
            }catch (Exception e){ }
        }
        else if (ModoLectura==true)
        {
            try {
                this.br.close();
                this.fr.close();
            }catch (Exception e) { }
        }
    }
    //Metodos de la clase
    public ArchivoTexto(String tituloArchivo) {
        //instanciar de la clase base
        super(tituloArchivo);
        try {
            file = new File(tituloArchivo);

            if (!file.exists())
                file.createNewFile();

            this.ArchivoExiste=true;
            this.ModoLectura=false;
            this.ModoEscritura=false;
        }
        catch (Exception e){
            System.out.println("Error al intentar buscar el archivo: ***" + e.getMessage()+"***");
            this.ArchivoExiste=false;
            //System.out.println();
        }
    }
    public ArchivoTexto(String a, boolean b){
        //instanciar de la clase base
        super(a);
    }
}
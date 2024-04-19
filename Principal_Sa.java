import Gestor.Archivo.*;
import Gestor.Empresarial.Contrato.Contrato;

import java.util.Scanner;
import java.util.Scanner.*;

public class Principal_Sa {
    public static void main(String[] args){
        ArchivoTexto file1 = new ArchivoTexto("C:\\Users\\karls\\OneDrive\\Documents\\Universidad\\5to cuatrimestre\\Enero-Abril2024\\ProyectoFinal");
        String linea;

        file1.escribir("Descargado por: ");
        file1.escribir("Karla Sarahi Solórzano Galván");
        file1.cerrar();

        file1.AbrirModoLectura();
        linea = file1.leer();

        while(linea !=null){
            System.out.println(linea);
            linea=file1.leer();
        }
        int folio;
        int annio;
        int opcion = 1;
        Contrato contrato1 = new Contrato(0001);
        contrato1.setNoContrato(221803060);
        contrato1.setAnnio(2023);
        file1.cerrar();
        Scanner scanner = new Scanner(System.in);
        while (opcion == 1){
            System.out.println("Contratos   \n");
            System.out.println("Menu \n");
            System.out.println("1.Crear un nuevo contrato \n2.Salir");
            System.out.println("Ingrese la opcion deseada:");
            opcion = scanner.nextInt();
            switch (opcion){
               case 1: System.out.println("\nIngrese los datos");
               Contrato contrato2 = new Contrato(0002);
               System.out.println("\nIngrese el folio del contrato:");
               folio=scanner.nextInt();
               contrato2.setNoContrato(folio);
               System.out.println("\nIngrese el annio del contrato");
               annio=scanner.nextInt();
               contrato2.setAnnio(annio);
               int noContrato = contrato2.getNoContrato();
               int anni = contrato2.getAnnio();
               System.out.println("Número de contrato: " + noContrato);
               System.out.println("Año: " + anni);
               break;
                case 2: System.out.println("\nSaliendo de contratos...\n");
                opcion=2;
                break;
                default:System.out.println("Opcion invalida....");

            }
        }
    }
}

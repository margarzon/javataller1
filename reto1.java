package retos;
import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura= new Scanner (System.in);
        System.out.println("Ingrese la cantidad de grados fahrenheit");
        int  numOne;
        double total;
        numOne= lectura.nextInt();
        total=(numOne - 32)/1.8;

        System.out.println("La temperatura de  "+numOne+" en grados centigrados es"+total );


        lectura.close();
        

    }
}
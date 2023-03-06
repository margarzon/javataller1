package retos;
import java.util.Scanner;

import java.util.Random;

public class reto3 {

    public static void main(String[] args) {
        
        Scanner lectura= new Scanner(System.in);
        Random oRandom= new Random();

        int moneda, opcion;

        System.out.println("Elige 1 si crees que va a caer cara y 2 sello");

        moneda=lectura.nextInt();

        opcion=oRandom.nextInt(2)+1;

        System.out.println(opcion);

        if(opcion==1 && moneda==1){
            System.out.println("El progrma eligio cara, ganaste");
        }else if( opcion==2 && moneda==2){
            System.out.println("El programa eligio sello, ganaste");
        } else if (opcion==1 && moneda==2){
            System.out.println("Perdiste, el programa eligio cara");
        }else if (opcion==2 && moneda==1){
            System.out.println("Perdiste, el programa eligio sello");

        lectura.close();
}
}
}
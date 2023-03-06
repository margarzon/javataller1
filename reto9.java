package retos;
import java.util.Scanner;

import java.util.Random;

public class reto9 {

    public static void main(String[] args) {
        
        Scanner lectura= new Scanner(System.in);
        Random oRandom= new Random();

        int moneda, opcion;

        System.out.println("Ingrese la cantidad de veces que quieres apostar");
        int N=lectura.nextInt();
        int suma = 0;
        for (int k = 1; k<= N ; k++){
            System.out.println("Apuesta" + k);
            System.out.println("Ingrese la cantidad que desea postar");
            int numero = lectura.nextInt();
            suma = suma + numero;

    
            System.out.println("Elige 1 si crees que va a caer cara y 2 sello");
    
            moneda=lectura.nextInt();
    
            opcion=oRandom.nextInt(2)+1;
    
            System.out.println(opcion);
    
            if(opcion==1 && moneda==1){
                System.out.println("El progrma eligio cara, ganaste");
                suma=suma*2;
                System.out.println("La cantidad total que te quedo es:" +suma);
    
            }else if( opcion==2 && moneda==2){
                System.out.println("El programa eligio sello, ganaste");
                suma=suma*2;
                System.out.println("La cantidad total que te quedo es:" +suma);
    
            } else if (opcion==1 && moneda==2){
                System.out.println("Perdiste, el programa eligio cara");
            }else if (opcion==2 && moneda==1){
                System.out.println("Perdiste, el programa eligio sello");
    
        }

       

       

        
        lectura.close();
}
}
}
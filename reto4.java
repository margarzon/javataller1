package retos;

import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido al juego de piedra, papel o tijera");

        int programa =  (int)(Math.random()*3) + 1;

        System.out.println("Indica tu seleccion(1 es piedra , 2 es papel y 2 tijera)");
        int usuario=lectura.nextInt();

        System.out.println("El programa eligio");

        switch (programa)
        {
            case 1:
            System.out.println("Piedra");
            switch(usuario){
                case 1: System.out.println("Hubo un empate");break;
                case 2: System.out.println("Ganaste");break;
                case 3: System.out.println("El programa gano");break;
            }
            break;

            case 2:
            System.out.println("Papel");
            switch(usuario){
                case 1: System.out.println("El programa gano");break;
                case 2: System.out.println("Hubo un empate");break;
                case 3: System.out.println("Ganaste");break;
            }
            break;
            
            case 3:
            System.out.println("Tijera");
            switch(usuario){
                case 1: System.out.println("Ganaste");break;
                case 2: System.out.println("El programa gano");break;
                case 3: System.out.println("Hubo un empate");break;
            }
            break;



        }

        
        lectura.close();
            
    }
    
}

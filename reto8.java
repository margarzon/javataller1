package retos;
import java.util.Random;
import java.util.Scanner;
public class reto8 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre;
        nombre = lectura.nextLine();
        System.out.println("En Supermercados Noé estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si ésta es mayor a 50.000 y dependiendo de tu suerte:");

        
        System.out.println("Ingrese la cantidad de productos");
        int N=lectura.nextInt();
        int compra = 0;
        for (int k = 1; k<= N ; k++){
            System.out.println("Producto " + k);
            System.out.println("Ingrese el valor del producto");
            int numero = lectura.nextInt();
            compra = compra + numero;
        }

        System.out.println("El valor total es  " +compra);

        

        if (compra<50000){
            System.out.println("Gracias por tu compra, pero no alcanzas a recibir un descuento"); 

        } else{
            System.out.println("Ya que tu compra es mayor a 50.000 tienes la oportunidad de elegir una pelota");
        }

        lectura.nextLine();

        Random pelota = new Random();
        String[] colorPelota = {"amarillo","blanco","azul","rojo"};
        int pelotasN = pelota.nextInt(colorPelota.length);
        String colorPelotas = colorPelota[pelotasN];

        switch (colorPelotas) {
            case "rojo":
            System.out.println("Obtuviste la pelota roja");
            System.out.println("Ganaste un descuento del 10% en tu compra");
            compra = compra - (compra*10)/100;
            System.out.println("Con el descuento tu compra queda en:"+compra);
            break;

            case "amarillo":
            System.out.println("Obtuviste la pelota amarilla");
            System.out.println("Ganaste un descuento del 50% en tu compra");
            compra = compra - (compra*50)/100;
            System.out.println("Con el descuento tu compra queda en:"+compra);
            break;

            case "blanco":
            System.out.println("Obtuviste la pelota blanco");
            System.out.println("Tu compra es gratis");
            compra = 0;
            break;

            case "azul":
            System.out.println("Obtuviste la pelota azul");
            System.out.println("Ganaste un descuento del 30% en tu compra");
            compra = compra - (compra*30)/100;
            System.out.println("Con el descuento tu compra queda en:"+compra);
            break;



        
            
        }

        System.out.println("Ingresa con cuanto dinero vas a pagar:");
         double dinero;
         dinero = lectura.nextDouble();

         double cambio= dinero-compra;

         System.out.println("Tu cambio es:"+cambio);
        

        lectura.close();

    }
}
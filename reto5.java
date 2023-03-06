package retos;

import java.util.Scanner;

public class reto5 {
  public static void main(String[] args) {
    Scanner lectura = new Scanner (System.in);
    String nombre;
    String apellidos;
    String apodo;
   
// Solicitud de datos al usuario
    System.out.println("Escriba su nombre en mayusculas.");
    System.out.print("Nombre: ");
    nombre = lectura.nextLine();
    System.out.print("Escriba sus apellidos en minusculas ");
    apellidos = lectura.nextLine();
    System.out.print("La longitud de su nombre es : "  +nombre.length());
    System.out.print("Su nombre completo es: " + nombre + " " + apellidos );

// Realizamos operaciones 
    apodo = nombre.substring(0,2)+apellidos.substring(0,1);
// Mostramos en pantalla
    System.out.println(" Su nombre combinado con su apellido es: " +apodo);    

    lectura.close();
  }
}
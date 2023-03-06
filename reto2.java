package retos;
import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) throws Exception {
        Scanner lectura= new Scanner (System.in);
        double peso,meses,dosis;
        System.out.println("Ingrese el peso del bebe");
        peso= lectura.nextInt();
        System.out.println("Ingrese los meses del bebe");
        meses= lectura.nextInt();
        dosis=((peso+10)/(meses*10))*8;
    

System.out.println("La dosis de la vacuna del bebe debe ser "+dosis );


        lectura.close();

    }
}
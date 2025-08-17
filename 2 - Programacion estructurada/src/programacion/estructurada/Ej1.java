package programacion.estructurada;
import java.util.Scanner;

public class Ej1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el anio a evaluar");
        int anio = input.nextInt();
        boolean bisiesto = false;
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
            bisiesto = true;
        }
        
        System.out.println("Analizando el anio ingresado..("+anio+")");
        System.out.println("Bisiesto = " +bisiesto);
    }
}
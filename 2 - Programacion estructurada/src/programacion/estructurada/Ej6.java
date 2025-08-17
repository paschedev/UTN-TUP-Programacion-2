package programacion.estructurada;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int pos = 0;
        int neg = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un numero entero (" + i + "/10): ");
            int n = input.nextInt();

            if (n > 0) {
                pos++;
            } else if (n < 0) {
                neg++;
            } else {
                ceros++;
            }
        }
        System.out.println("Cantidad de positivos: " + pos+"\nCantidad de negativos: " + neg+"\nCantidad de ceros: " + ceros);
    }
}
package programacion.estructurada;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n, suma = 0;
        
        System.out.print("Ingrese un numero (0 para terminar): ");
        n = input.nextInt();

        while (n != 0) {
            if (n % 2 == 0) {
                suma += n;
            }
            System.out.print("Ingrese un numero (0 para terminar): ");
            n = input.nextInt();
        }
        System.out.println("La suma de los numeros pares ingresados es: " + suma);
    }
}
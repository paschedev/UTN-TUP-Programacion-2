
package programacion.estructurada;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] nums = new int[3];
        int mayor = Integer.MIN_VALUE;
        System.out.println("Ingrese 3 numeros enteros");
        
        for (int i=0; i<3; i++){
            nums[i] = input.nextInt();
            if (nums[i] > mayor){
                mayor = nums[i];
            }
        }
        System.out.println("El mayor numero de los 3 es el "+mayor+".");
    }
}

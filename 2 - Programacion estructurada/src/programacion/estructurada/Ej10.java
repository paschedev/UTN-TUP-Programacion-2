package programacion.estructurada;

import java.util.Scanner;

public class Ej10 {
    
    public static int actualizarStock(int stockActual, int recibidos, int vendidos){
        int stock = stockActual + recibidos - vendidos;
        return stock;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int vendidos = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int recibidos = input.nextInt();

        int nuevoStock = actualizarStock(stockActual, recibidos, vendidos);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
}
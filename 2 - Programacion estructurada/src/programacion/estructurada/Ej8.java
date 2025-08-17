package programacion.estructurada;

import java.util.Scanner;

public class Ej8 {
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        return precioFinal;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
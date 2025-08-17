package programacion.estructurada;

import java.util.Scanner;

public class Ej11 {
    
    static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}
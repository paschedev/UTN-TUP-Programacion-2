package programacion.estructurada;

import java.util.Scanner;

public class Ej9 {
    
    public static double calcularCostoEnvio(double peso, String zona){
        
        double costoEnvio = 0;
        int multi = 0;
        
        if (zona == "Nacional"){
            multi = 5;
        }else{
            multi = 10;
        }
        costoEnvio = peso * multi;
        return costoEnvio;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
        double precioTotal = precioProducto + costoEnvio;        
        return precioTotal;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese los datos del producto y envio para calcular\nPeso:");
        double peso = input.nextDouble();
        System.out.println("Ingrese la opcion que corresponda...\n1. Nacional\n2. Internacional");
        int num = input.nextInt();
        
        String envio = "";
        
        switch (num){
            case 1 -> envio = "Nacional";
            case 2 -> envio = "Internacional";
            default -> System.out.println("Numero elegido Invalido");
        }
        System.out.println("Precio: ");
        double precio = input.nextDouble();
        
        System.out.println("El total a pagar es: "+ calcularTotalCompra(precio, calcularCostoEnvio(peso, envio)));
    }
}
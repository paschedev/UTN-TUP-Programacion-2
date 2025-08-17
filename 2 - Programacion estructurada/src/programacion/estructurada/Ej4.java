package programacion.estructurada;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto");
        double precio = input.nextDouble();
        System.out.println("Ingrese la categoria");
        char cat = Character.toLowerCase(input.next().charAt(0)); // se guarda el char en su version minuscula para luego validarlo correctamente sin repetir codigo, con buenas practicas :D
        
        while (cat != 'a' && cat != 'b' && cat != 'c'){
            System.out.println("Categoria erronea, intente nuevamente");
        }
        double dcto;
        double pFinal;
        
        if(cat == 'a'){
            dcto = 10;
        }else if(cat == 'b'){
            dcto = 15;
        }else{
            dcto = 20;
        }
        pFinal = precio * (1 - dcto / 100);
        
        System.out.println("El precio del producto ingresado es: "+precio+"\nDescuento aplicado: "+dcto+"\n\nPrecio final a pagar: "+pFinal);
    }
}
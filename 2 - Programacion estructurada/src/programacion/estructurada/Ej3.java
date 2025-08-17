
package programacion.estructurada;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad expresada en anios");
        int edad = input.nextInt();
        String etapa = "";
        
        if (edad >0){
            if (edad <= 12){
                etapa = "Ninio";
            }else if(edad <= 17){
                etapa = "Adolescente";
            }else if(edad <= 59){
                etapa = "Adulto";
            }else{
                etapa = "Adulto mayor";
            }            
            System.out.println("Estas en la etapa de "+etapa);
        }else{
            System.out.println("El anio ingresado no es valido.");
        }
    }
}

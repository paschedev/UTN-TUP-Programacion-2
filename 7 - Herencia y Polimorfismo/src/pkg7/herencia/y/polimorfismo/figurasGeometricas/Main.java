/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.figurasGeometricas;

import java.util.ArrayList;

/**
 *
 * @author gasto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Circulo(6));
        figuras.add(new Rectangulo(3,11));
        figuras.add(new Rectangulo(7,2));
        figuras.add(new Circulo(9));
        
        for(Figura f : figuras){
            System.out.println("El area es un " + f.getNombre() + " y su area es " + f.calcularArea());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.animales;

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
        
        ArrayList<Animal> animales = new ArrayList<Animal>();
        
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        animales.add(new Animal());
        
        for (Animal a : animales){
            a.describirAnimal();
            a.hacerSonido();
        }
    }
}

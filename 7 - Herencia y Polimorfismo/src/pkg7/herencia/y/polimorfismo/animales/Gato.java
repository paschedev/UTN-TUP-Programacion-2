/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.animales;

/**
 *
 * @author gasto
 */
public class Gato extends Animal{

    @Override
    public void describirAnimal() {
        System.out.println("Felino domestico");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau..");
    }
    
}

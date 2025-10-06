/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.figurasGeometricas;

/**
 *
 * @author gasto
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.setNombre("Circulo");
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return (2 * this.radio) * Math.PI;
    }    
}

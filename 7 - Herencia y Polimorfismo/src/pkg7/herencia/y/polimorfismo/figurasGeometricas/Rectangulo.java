/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.figurasGeometricas;

/**
 *
 * @author gasto
 */
public class Rectangulo extends Figura{
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho) {
        this.setNombre("Rectangulo");
        this.alto = alto;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea() {
        return alto * ancho;
    }    
}

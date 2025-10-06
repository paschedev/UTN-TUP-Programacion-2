/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.vehiculos;

/**
 *
 * @author gasto
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + getMarca() + ", modelo=" + getModelo() + ",cantidadPuertas=" + cantidadPuertas + '}';
    }

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
}

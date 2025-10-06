/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.empleados;

/**
 *
 * @author gasto
 */
public class EmpleadoTemporal extends Empleado{

    public EmpleadoTemporal(String nombre, double sueldo) {
        super(nombre, sueldo);
    }
    
    @Override
    public double calcularSueldo() {
        return getSueldo() * 0.8; //Cobra el 80% de un sueldo normal
    }
    
}

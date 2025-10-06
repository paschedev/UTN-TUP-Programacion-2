/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.empleados;

/**
 *
 * @author gasto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoTemporal("Gaston", 20000),
            new EmpleadoPlanta("Tomas", 20000)
        };
        
        for(Empleado e : empleados){
            if (e instanceof EmpleadoTemporal){
                System.out.println("El empleado temporal " + e.getNombre() + " cobra $" + e.calcularSueldo());
            }else{
                System.out.println("El empleado fijo en planta " + e.getNombre() + " cobra $" + e.calcularSueldo());
            }
        }
    }
}

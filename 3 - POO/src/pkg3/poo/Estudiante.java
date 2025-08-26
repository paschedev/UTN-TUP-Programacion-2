/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.poo;

/**
 *
 * @author gasto
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calif;
    
    public void mostrarInfo(){
        System.out.println("Datos de "+nombre+ " "+apellido+":\nCurso: "+curso+"\nCalificacion: "+calif);
    }
    
    public void subirCalif(double puntos){
        calif += puntos;
        if(calif > 10){
            calif = 10;
        }
    }
    
    public void bajarCalif(double puntos){
        calif -= puntos;
        if(calif < 0){
            calif = 0;
        }
    }
    
    public void mostrarCalif(){
        System.out.println("Calificacion de " + nombre + ": "+ calif);
    }
}

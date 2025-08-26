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
        System.out.println("La calificacion subio a "+calif);
        if(calif > 10){
            calif = 10;
            System.out.println("La calificacion no puede ser mayor a 10.. La calificacion es "+calif);
        }
    }
    
    public void bajarCalif(double puntos){
        calif -= puntos;
        System.out.println("La calificacion bajo a "+calif);
        if(calif < 0){
            calif = 0;
            System.out.println("La calificacion no puede ser menor a 0.. La calificacion es "+calif);
        }
    }
    
    public void mostrarCalif(){
        System.out.println("Calificacion de " + nombre + ": "+ calif);
    }
}

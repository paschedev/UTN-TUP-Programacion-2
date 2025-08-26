/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.poo;

/**
 *
 * @author gasto
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edadIni){
        this.idGallina = idGallina;
        this.edad = edadIni;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo.\nTotal: " + huevosPuestos+"\n");
    }
    
    public void ponerHuevo(int huevos){
        huevosPuestos += huevos; // Un poquito de Overload para hacerlo mas dinamico..
        System.out.println("La gallina " + idGallina + " puso "+huevos+" huevos.\nTotal: " + huevosPuestos+"\n");
    }
    
    public void envejecer(){
        edad++;
        System.out.println("La gallina " + idGallina + " envejecio.\nAhora tiene " + edad + " anos.\n");
    }
    
    public void mostrarEstado(){
        System.out.println("Gallina "+ idGallina + "\nEdad: "+edad +"\nHuevos puestos: "+ huevosPuestos+"\n");
    }
}

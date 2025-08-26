/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.poo;

/**
 *
 * @author gasto
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean enVuelo = false;
    
    public void despegar(){
        if (combustible >= 20){
            enVuelo = true;
            combustible -= 20;
            System.out.println("DESPEGUE!\n");
        }else{
            System.out.println("Despegue fallido. Recargue combustible.");
        }
    }
    
    public void avanzar(int distancia){
        if (!enVuelo){
            return;
        }
        if (combustible >0 && combustible >= distancia){
            combustible -= distancia;
            System.out.println("Avanzando "+ distancia * 50+" metros..\n");
        }else{
            System.out.println("Combustible insuficiente, momento de recargar.\n");
        }
    }
    
    public void recargarCombustible(int cant){
        if (cant <= 0){
            System.out.println("Valor no valido.");
            return;
        }
        if (cant + combustible >50){
            System.out.println("No desperdicies combustible!\n");
            return;
        }        
        combustible += cant;
        System.out.println("Cargando combustible..\nCombustible actual: "+combustible);
    }
    
    public void mostrarEstado(){
        System.out.println("Nave: "+nombre+"\nCombustible: "+combustible+"\n");
    }
    
    public void setNave(String n, int x){
        nombre = n; combustible = x;
    }
}

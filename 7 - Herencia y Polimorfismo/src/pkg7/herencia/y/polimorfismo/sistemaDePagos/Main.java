/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.sistemaDePagos;

import java.util.ArrayList;

/**
 *
 * @author gasto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pagable> pagos = new ArrayList<>();
        
        pagos.add(new TarjetaCredito());
        pagos.add(new Transferencia());
        pagos.add(new Efectivo());
        
        for(Pagable p : pagos){
            procesarPago(p);
        }
    }
    
    public static void procesarPago(Pagable metodo){
        metodo.pagar();
    }
}

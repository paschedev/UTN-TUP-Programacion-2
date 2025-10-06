/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.herencia.y.polimorfismo.sistemaDePagos;

/**
 *
 * @author gasto
 */
public class Efectivo implements Pagable{

    @Override
    public void pagar() {
        System.out.println("Pago hecho en efectivo");
    }    
}

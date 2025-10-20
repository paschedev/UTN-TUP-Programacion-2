/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.interfaces;

/**
 *
 * @author gasto
 */
public class TarjetaCredito implements PagoConDescuento{
    
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }    

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.85; //15% de dto.
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $"+monto+" con tarjeta: "+numero);
    }    
}
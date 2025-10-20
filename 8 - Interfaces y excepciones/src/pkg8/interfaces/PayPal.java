/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.interfaces;

/**
 *
 * @author gasto
 */
public class PayPal implements Pago{
    
    private String usuario;
    private double saldo;

    public PayPal(String usuario, double saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $"+monto+" con la cuenta de PayPal: "+usuario);
        saldo -= monto;
    }
}
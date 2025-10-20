/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.interfaces;

/**
 *
 * @author gasto
 */
public class Cliente implements Notificable {

    private String nombre;
    private String correo;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Para " + nombre + " (" + correo + "): " + mensaje);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.exceptions;

/**
 *
 * @author gasto
 */
public class EdadInvalidaException extends RuntimeException {

    public EdadInvalidaException(String mensaje) {
        mensaje = "Edad invalida";
    }
}

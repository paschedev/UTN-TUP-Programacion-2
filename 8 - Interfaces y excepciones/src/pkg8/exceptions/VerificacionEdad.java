/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.exceptions;

/**
 *
 * @author gasto
 */
public class VerificacionEdad {

    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: " + edad);
        }
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        try {
            verificarEdad(150); // Cambiar el valor para probar
        } catch (EdadInvalidaException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

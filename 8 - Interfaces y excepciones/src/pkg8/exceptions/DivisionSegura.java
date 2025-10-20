/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.exceptions;

import java.util.Scanner;

/**
 *
 * @author gasto
 */
public class DivisionSegura {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Ingrese el dividendo: ");
            double a = sc.nextDouble();

            System.out.print("Ingrese el divisor: ");
            double b = sc.nextDouble();

            double resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Error: no se puede dividir por cero.");
            // Deberia hacerse multicatch por si se ingresa un String como dividendo o divisor.
        }
    }
}

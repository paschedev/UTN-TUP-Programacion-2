/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author gasto
 */
public class LecturaArchivo {
    public static void main(String[] args) {
        File archivo = new File("Resource.txt");

        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
        } catch (FileNotFoundException exx) {
            System.out.println("Error: el archivo no se pudo encontrar o no abre.");
        }
    }
}

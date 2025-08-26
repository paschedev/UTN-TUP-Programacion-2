/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.poo;

import java.time.Year;

/**
 *
 * @author gasto
 */
public class Libro {
    protected long anioActual = Year.now().getValue(); // Busque como consumir fechas en Java para que el codigo no quede obsoleto si el año del calendario cambiase.
    private String titulo = "Martin Fierro";
    private String autor = "Jose Hernandez";
    private long anioPub = 1938;
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public long getAnioPub(){
        return anioPub;
    }
    
    public void setAnioPub(long anio){
        if (anio > 0 && anio < anioActual){
            anioPub = anio; 
            System.out.println("El anio de publicacion ha sido cambiado exitosamente!\n");
        }else{
            System.out.println("El anio ingresado no es valido.\n");
        }
    }
}

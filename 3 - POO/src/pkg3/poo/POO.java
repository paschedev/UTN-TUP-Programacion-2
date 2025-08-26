/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.poo;

public class POO {
    
    public static void saltos(){
        System.out.println("\n"); // FUNCION CREADA PARA GENERAR SALTOS DE LINEA RAPIDAMENTE ENTRE EJERCICIOS...
    }
    
    public static void main(String[] args) {
        Estudiante x = new Estudiante();
        x.nombre = "Gaston";
        x.apellido = "Paschetta";
        x.curso = "Primer anio";
        x.calif = 6;
        
        x.mostrarInfo();
        
        x.mostrarCalif();
        
        x.subirCalif(10);        
        x.mostrarCalif();
        
        x.bajarCalif(25);        
        x.mostrarCalif();
        
        x.subirCalif(7.35);
        x.mostrarCalif();
        
        saltos();
        
        Mascota chimo = new Mascota();
        chimo.nombre = "Simud";
        chimo.especie = "Gato";
        chimo.edad = 10;
        
        chimo.mostrarInfo();
        chimo.cumplirAnios();
        chimo.mostrarInfo();
        
        saltos();
        
        Libro y = new Libro();
        String nombreLibro = y.getTitulo();
        String autorLibro = y.getAutor();
        long anioPub = y.getAnioPub();
        
        System.out.println("Libro: "+nombreLibro+"\nAutor: "+autorLibro+"\nAnio de publicacion: "+ anioPub+"\n");
        
        y.setAnioPub(2308);
        y.setAnioPub(2008);
        
        System.out.println("Libro: "+nombreLibro+"\nAutor: "+autorLibro+"\nAnio de publicacion: "+ anioPub+"\n");
        
        saltos();
        
        Gallina a = new Gallina(1, 1);
        Gallina b = new Gallina(2, 3);
        
        a.mostrarEstado();
        b.mostrarEstado();
        
        a.ponerHuevo();
        b.ponerHuevo();
        a.envejecer();
        b.envejecer();
        a.ponerHuevo(4);
        b.ponerHuevo(2);
        
        a.mostrarEstado();
        b.mostrarEstado();
        
        saltos();
        
        NaveEspacial sunny = new NaveEspacial();
        
        sunny.setNave("Thousand Sunny",10);
        sunny.mostrarEstado();        
        
        sunny.despegar();
        sunny.recargarCombustible(10);        
        sunny.despegar();
        
        sunny.avanzar(1);
        sunny.recargarCombustible(60);
        sunny.recargarCombustible(30);
        sunny.avanzar(20);
        sunny.avanzar(20);
        sunny.avanzar(10);
    }
}

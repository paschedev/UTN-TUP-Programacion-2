package tp.pkg6.colecciones;
//Imports

import tp.pkg6.colecciones.casopractico1.*;
import tp.pkg6.colecciones.casopractico2.*;
import tp.pkg6.colecciones.casopractico3.*;

public class TP6Colecciones {

    public static void main(String[] args) {

        //CASO PRACTICO 1    
        /*
    Producto a = new Producto("Maple de 6 huevos", 2500, CategoriaProducto.ALIMENTOS);
    Producto b = new Producto("Horno", 150000, 2, CategoriaProducto.ELECTRONICA);
    Producto c = new Producto("Bermuda", 20000, 6, CategoriaProducto.ROPA);
    Producto d = new Producto("Foco", 1500, CategoriaProducto.HOGAR);
    Producto e = new Producto("PortaFoco", 1100, CategoriaProducto.HOGAR);
    
    Inventario inv = new Inventario();    
    inv.agregarProducto(a);
    inv.agregarProducto(b);
    inv.agregarProducto(c);
    inv.agregarProducto(d);
    inv.agregarProducto(e);
    
    inv.listarProductos();    
    System.out.println("\n");
    
    inv.buscarProductoPorID(b.getId());    
    System.out.println("\n");
    
    inv.filtrarPorCategoria(CategoriaProducto.ROPA);    
    System.out.println("\n");
    
    inv.eliminarProducto(b.getId());
    inv.listarProductos();    
    System.out.println("\n");
    
    System.out.println("Cantidad de " + a.getNombre());
    inv.actualizarStock(a.getId(), 20);
    a.mostrarInfo();
    System.out.println("\n");
    
    inv.obtenerTotalStock();    
    System.out.println("\n");
    
    inv.obtenerProductoConMayorStock();    
    System.out.println("\n");
    
    inv.filtrarProductosPorPrecio(1000, 3000);
    System.out.println("\n");
    
    inv.mostrarCategoriasDisponibles();
         */
        //CASO PRACTICO 2    
        /*
    Biblioteca biblioteca = new Biblioteca();
    
    Autor a1 = new Autor("A01", "Stephen King", "USA");
    Autor a2 = new Autor("A02", "J. K. Rowling", "UK");
    Autor a3 = new Autor("A03", "Jose Hernandez", "ARG");
    
    biblioteca.agregarLibro("978-0670813025", "It", 1986, a1);
    biblioteca.agregarLibro("10: 0385121679", "The Shining", 1977, a1);
    biblioteca.agregarLibro("978-0-7475-5819-4", "Harry Potter", 1997, a2);
    biblioteca.agregarLibro("978-84-7583-262-3", "Martin Fierro", 1991, a3);
    biblioteca.agregarLibro("978-0-385-08695-0", "Carrie", 1974, a1);
    
    biblioteca.listarLibros();
    for(Libro lib : biblioteca.getLibros()){
        lib.getAutor().mostrarInfo();
    }
    System.out.println("\n");
    
    biblioteca.buscarLibroPorISBN("978-0670813025");
    System.out.println("\n");
    
    biblioteca.filtrarLibrosPorAnio(1997);
    System.out.println("\n");
    
    biblioteca.eliminarLibro("978-0-385-08695-0");
    biblioteca.listarLibros();
    System.out.println("\n");
    
    System.out.println(biblioteca.getLibros().size());
    System.out.println("\n");
    
    biblioteca.mostrarAutoresDisponibles();
    System.out.println("\n");
    }
         */
        // Caso practico 3
        // Class instances
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("p1", "Jorge Vald", "Tecnologia");
        Profesor p2 = new Profesor("p2", "Nancy Aleno", "Ciencias Sociales");
        Profesor p3 = new Profesor("p3", "Paula Gutierrez", "Industria");

        Curso c1 = new Curso("1", "Programacion I");
        Curso c2 = new Curso("2", "Bases de Datos I");
        Curso c3 = new Curso("3", "Programacion II");
        Curso c4 = new Curso("4", "Historia");
        Curso c5 = new Curso("5", "Mecanica");

        // Adding objs to lists
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Curso to Profesor asignment
        uni.asignarProfesorACurso("1", "p2");
        uni.asignarProfesorACurso("2", "p1");
        uni.asignarProfesorACurso("3", "p1");
        uni.asignarProfesorACurso("4", "p2");
        uni.asignarProfesorACurso("5", "p3");

        // Objects listing
        uni.listarProfesores();
        uni.listarCursos();

        // Before changing data
        p2.mostrarInfo();
        c1.mostrarInfo();
        
        uni.asignarProfesorACurso("1", "p1"); // Actual change of data
        
        // After changing data
        p2.mostrarInfo();
        c1.mostrarInfo();
        p1.mostrarInfo();
        
        // Curso removement and showing results
        uni.eliminarCurso("4");
        uni.listarCursos();
        p2.mostrarInfo();
        
        // Profesor removement and showing results
        uni.eliminarProfesor("p2");
        uni.listarProfesores();
    }
}

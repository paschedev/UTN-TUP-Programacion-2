
package tp.pkg6.colecciones;
//Imports
import tp.pkg6.colecciones.casopractico1.CategoriaProducto;
import tp.pkg6.colecciones.casopractico1.Inventario;
import tp.pkg6.colecciones.casopractico1.Producto;
import tp.pkg6.colecciones.casopractico2.Autor;
import tp.pkg6.colecciones.casopractico2.Libro;
import tp.pkg6.colecciones.casopractico2.Biblioteca;

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
}


package tp.pkg6.colecciones.casopractico2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPub, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPub, autor));
    }
    
    public void listarLibros(){
        for(Libro lib : libros){
            lib.mostrarInfo();
        }
    }
    
    public void buscarLibroPorISBN(String isbn){
        for(Libro lib:libros){
            if(lib.getIsbn().equals(isbn)){
               lib.mostrarInfo(); 
            }
        }
    }
    
    public void eliminarLibro(String isbn){
        libros.removeIf(lib -> lib.getIsbn().equals(isbn));
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio){
        for(Libro lib:libros){
            if(lib.getAnioPub() == anio){
                lib.mostrarInfo();
            }
        }
    }
    
    public void mostrarAutoresDisponibles(){
        List<Autor> autores = new ArrayList<>();
        for(Libro lib:libros){
            if(!autores.contains(lib.getAutor())){
                autores.add(lib.getAutor());
                System.out.println(lib.getAutor());
            }
        }
    }
}


package tp.pkg6.colecciones.casopractico2;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPub;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPub, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPub = anioPub;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPub() {
        return anioPub;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public void mostrarInfo(){
        System.out.println("Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioPub=" + anioPub + ", autor=" + autor + '}');
    }
}

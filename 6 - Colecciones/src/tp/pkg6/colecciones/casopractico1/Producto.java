/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg6.colecciones.casopractico1;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    private int contadorP;
    
    //Constructor sin cantidad
    public Producto(String nombre, double precio, CategoriaProducto cat){
        this.nombre = nombre; this.precio = precio; this.categoria = cat;
        contadorP++;
        id = cat.name() + "-" + contadorP;
    }
    //Constructor con cantidad
    public Producto(String nombre, double precio, int cantidad, CategoriaProducto cat){
        this.nombre = nombre; this.precio = precio; this.cantidad = cantidad; this.categoria = cat;
        contadorP++;
        id = cat.name() + "-" + contadorP;
    }
    //Constructor vacio
    public Producto(){
        
    }
    
    
    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}');
    }
}

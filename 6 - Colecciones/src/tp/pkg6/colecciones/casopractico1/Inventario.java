
package tp.pkg6.colecciones.casopractico1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList <Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        for(Producto p : productos){
            p.mostrarInfo();
        }
    }
    
    public void buscarProductoPorID(String id){
        for(Producto p : productos){
            if (p.getId().equals(id)){
                p.mostrarInfo();
            }
        }
    }
    
    public void eliminarProducto(String id){
        productos.removeIf(p -> p.getId().equals(id));
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        for(Producto p : productos){
            if (p.getId().equals(id)){
                p.setCantidad(nuevaCantidad);
            }
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria){
        for(Producto p : productos){
            if (categoria == p.getCategoria()){
                p.mostrarInfo();
            }
        }
    }
    
    public int obtenerTotalStock(){
        int stockTotal = 0;
        for(Producto p : productos){
            stockTotal += p.getCantidad();
        }
        return stockTotal;
    }
    
    public void obtenerProductoConMayorStock(){
        Producto mayorStock = new Producto();
        for(Producto p : productos){
            if(p.getCantidad() > mayorStock.getCantidad()){
                mayorStock = p;
            }
        }
        System.out.println("PRODUCTO CON MAYOR STOCK");
        mayorStock.mostrarInfo();
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        for(Producto p : productos){
            if(p.getPrecio() >= min && p.getPrecio() <= max){
                p.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles(){
        for (CategoriaProducto cat : CategoriaProducto.values()){
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}

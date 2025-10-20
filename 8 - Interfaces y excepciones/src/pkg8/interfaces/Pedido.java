/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gasto
 */
public class Pedido implements Pagable {

    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public Pedido() {
        productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
}

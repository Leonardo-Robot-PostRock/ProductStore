package org.com.ventas.test;

import org.com.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalón", 100.00);
        Producto producto3 = new Producto("Campera", 500);
        Producto producto4 = new Producto("Gorra", 50);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        orden1.agregarProducto(producto);
        orden1.agregarProducto(producto2);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);

        orden1.mostrarOrden();
        orden2.mostrarOrden();
    }
}

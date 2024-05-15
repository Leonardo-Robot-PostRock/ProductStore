package org.com.mundopc.test;

import org.com.mundopc.*;

public class MundoPcTest {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth", "Samsung");
        Raton ratonGamer = new Raton("bluetooth", "logitech");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden = new Orden();
        Orden orden2 = new Orden();

        orden.agregarComputadora(computadoraHP);
        orden.agregarComputadora(computadoraGamer);
        orden2.agregarComputadora(computadoraGamer);
        orden.mostrarOrden();
        orden2.mostrarOrden();
    }
}

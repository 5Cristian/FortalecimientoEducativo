package com.geometria.triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrianguloTest {

    @Test
    void calcularAreaDevuelveResultadoCorrecto() {
        Triangulo triangulo = new Triangulo();
        double resultado = triangulo.calcularArea(10, 4);
        assertEquals(20, resultado);
    }
}

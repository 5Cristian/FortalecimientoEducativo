package com.geometria.triangulo;

public class Triangulo {

    public double calcularArea(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser mayores que cero.");
        }
        return (base * altura) / 2;
    }

    public double calcularPerimetro(double lado1, double lado2, double lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Todos los lados deben ser mayores que cero.");
        }
        return lado1 + lado2 + lado3;
    }
}
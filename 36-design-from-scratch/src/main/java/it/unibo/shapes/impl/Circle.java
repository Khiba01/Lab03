package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;

public class Circle implements Shape {

    private double raggio;
    private static final double PI = Math.PI;

    public Circle(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double area() {
        return raggio * raggio * PI;
    }

    @Override
    public double perimetro() {
        return 2 * raggio * PI;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public String toString() {
        return "Circle [raggio=" + raggio + "]";
    }
    
}

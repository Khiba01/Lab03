package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon{

    private double lato;
    private static final int ANGOLI = 4;

    public Square(double lato) {
        this.lato = lato;
    }

    @Override
    public double area() {
        return lato * lato;
    }

    @Override
    public double perimetro() {
        return lato * ANGOLI;
    }

    @Override
    public int getEdgeCount() {
        return ANGOLI;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public static int getAngoli() {
        return ANGOLI;
    }

    @Override
    public String toString() {
        return "Square [lato=" + lato + "]";
    }
    
}

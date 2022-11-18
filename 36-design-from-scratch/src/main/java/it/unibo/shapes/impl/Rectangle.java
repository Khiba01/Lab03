package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {

    private double l1;
    private double l2;
    private static final int ANGOLI = 4; 

    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double area() {
        return l1 * l2;
    }

    @Override
    public double perimetro() {
        return l1 + l1 + l2 + l2;
    }

    @Override
    public int getEdgeCount() {
        return ANGOLI;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public static int getAngoli() {
        return ANGOLI;
    }

    @Override
    public String toString() {
        return "Rectangle [l1=" + l1 + ", l2=" + l2 + "]";
    }
    
}

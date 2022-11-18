package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon{

    private double base;
    private double l2;
    private double l3;
    private double h;
    private static final int ANGOLI = 3;

    public Triangle(double base, double l2, double l3, double h) {
        this.base = base;
        this.l2 = l2;
        this.l3 = l3;
        this.h = h;
    }

    @Override
    public double area() {
        return base * h;
    }

    @Override
    public double perimetro() {
        return base + l2 + l3;
    }

    @Override
    public int getEdgeCount() {
        return ANGOLI;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public static int getAngoli() {
        return ANGOLI;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", l2=" + l2 + ", l3=" + l3 + ", h=" + h + "]";
    }
    
}

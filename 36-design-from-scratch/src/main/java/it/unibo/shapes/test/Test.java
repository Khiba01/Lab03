package it.unibo.shapes.test;

import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class Test {

    public static void main(final String[] args) {
        Rectangle a = new Rectangle(10L, 30L);
        Square b = new Square(15L);
        Triangle c = new Triangle(10L, 3L, 9L, 5L);
        Circle d = new Circle(10.5);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

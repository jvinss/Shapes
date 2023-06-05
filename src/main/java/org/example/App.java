package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Point center = new Point(0,0);
        Rectangle r = new Rectangle(center, 20,10);
        System.out.println(r.toString());
        System.out.println("Perimetro: " + r.perimeter() + " Area: " + r.area());

    }
}

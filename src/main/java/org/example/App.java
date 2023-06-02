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
        Circle c = new Circle(center,5);
        System.out.println(c.toString());
        System.out.println("Circonferenza: " + c.perimeter() + " Area: " + c.area());

        Rectangle r = new Rectangle(20,10);
        System.out.println(r.toString());
        System.out.println("Perimetro: " + r.perimeter() + " Area: " + r.area());

        Square s = new Square(10);
        System.out.println(s.toString());
        System.out.println("Perimetro: " + s.perimeter() + " Area: " + s.area());
    }
}

package org.example;

public class Hexagon extends Shape{
    private double side;

    public Hexagon(Point center, double side) {
        super(center);
        this.setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area() {
        return (3 * Math.sqrt(3) * this.side * this.side) / 2;
    }

    public double perimeter () {
        return this.side * 6;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "side=" + side +
                ", center=" + center +
                '}';
    }
}

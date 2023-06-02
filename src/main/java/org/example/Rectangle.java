package org.example;

public class Rectangle extends Shape{
    private double base;
    private double height;

    public Rectangle(int base, int height) {
        setBase(base);
        setHeight(height);
    }


    public double area () {
        return this.base * this.height;
    }

    public double perimeter () {
        return this.base * 2 + this.height * 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}

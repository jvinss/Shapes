package org.example;

public class Rectangle extends Shape{
    private double base;
    private double height;

    public Rectangle(Point center, int base, int height) {
        super(center);
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

    public boolean Interstection (Rectangle r){
        Point centerR = this.getCenter();
        Point centerR2 = r.getCenter();

        double x1 = centerR.getX();
        double x2 = centerR2.getX();
        double distanceX = Math.abs(x1-x2);


        double y1 = centerR.getY();
        double y2 = centerR2.getY();
        double distanceY = Math.abs(y1-y2);

        double base1 = this.getBase();
        double base2 = r.getBase();

        double height1 = this.getHeight();
        double height2 = r.getHeight();

        return (distanceX <= ((base1 + base2) / 2) && distanceY <= ((height1 + height2) / 2) );
    }
}

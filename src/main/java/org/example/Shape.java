package org.example;

public class Shape {
    Point center;

    public Shape(Point center) {
        this.setCenter(center);
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}

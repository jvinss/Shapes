package org.example;

public class Square {
    private int side;
    private Point center;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int area () {
        return this.side*this.side;
    }

    public int perimeter () {
        return this.side*4;
    }
}

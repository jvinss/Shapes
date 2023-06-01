package org.example;

public class Rectangle {
    private int base;
    private int height;
    private Point center;

    public Rectangle(int base, int height) {
        setBase(base);
        setHeight(height);
    }


    public int area () {
        return this.base * this.height;
    }

    public int perimeter () {
        return this.base * 2 + this.height * 2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

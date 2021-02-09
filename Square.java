package com.company;

public class Square {
    private double sideLength;
    private double circumFerence;
    private double area;

    public Square() {
        this.sideLength = 1.0;
        this.area = 1.0;
        this.circumFerence = 4.0;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.area = sideLength*sideLength;
        this.circumFerence = sideLength*4;
    }

    public double getArea() {
        return area;
    }

    public double getCircumFerence() {
        return circumFerence;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCircumFerence(double circumFerence) {
        this.circumFerence = circumFerence;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square[" +
                "sideLength=" + sideLength +
                ", circumFerence=" + circumFerence +
                ", area=" + area +
                ']';
    }
}

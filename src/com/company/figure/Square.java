package com.company.figure;

public class Square implements Figure {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double findDiagonal() {
        return length * Math.sqrt(2);
    }


}

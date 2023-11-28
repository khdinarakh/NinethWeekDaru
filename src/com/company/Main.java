package com.company;

import com.company.figure.Figure;
import com.company.figure.Rectangle;
import com.company.figure.Square;
import com.company.student.Student;
import com.company.triangle.StarTriangle;

public class Main {

    public static void main(String[] args) {
        StarTriangle star = new StarTriangle(5);
        System.out.println(star.toString());

        Square square = new Square(4);
        System.out.println("Area: " + square.calculateArea() + ". Perimeter: " + square.calculatePerimeter() + ". Diagonal: " + square.findDiagonal());

        Figure figure = new Rectangle(4,5);
        System.out.println(figure.calculateArea());


    }
}

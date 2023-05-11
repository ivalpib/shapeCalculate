/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapecalculate;

/**
 *
 * @author Biplav Karki
 * Student ID : 54614
 */
public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public double getArea() {
        double area;
        area = length * breadth;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * (length + breadth);
        return perimeter;
    }
}

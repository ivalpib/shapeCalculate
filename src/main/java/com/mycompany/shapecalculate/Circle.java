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

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}


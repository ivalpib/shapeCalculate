/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.shapecalculate;

import java.util.Scanner;

/**
 *
 * @author valpib
 */
public class ShapeCalculate {
    
   
    public static void main(String[] args) {
    Shape[] shapes = new Shape[5];
    
    shapes[0] = new Rectangle("red", 3, 4);
    shapes[1] = new Circle("purple", 2);
    shapes[2] = new Rectangle("blue", 5, 6);
    shapes[3] = new Circle("white", 3);
    shapes[4] = new Rectangle("black", 4, 5);

        for (Shape shape : shapes) {
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
}

        for(int i=0; i<=shapes.length-1;i++){
             System.out.println("Color: " + shapes[i].color);
             System.out.println("Area: " + shapes[i].getArea());
             System.out.println("Perimeter: " + shapes[i].getPerimeter());
             System.out.println();
        }
    }

}

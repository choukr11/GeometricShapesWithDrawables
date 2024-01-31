package DrawblesWithGeo;


import javax.swing.*;
import java.awt.*;

import static com.sun.tools.javac.main.Option.X;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius= radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public void displayShapeType() {
        System.out.println("This is a Circle!");
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing a Circle");
    }

    @Override
    public void displayShape() {
        System.out.println("Displaying Circle");
    }
}



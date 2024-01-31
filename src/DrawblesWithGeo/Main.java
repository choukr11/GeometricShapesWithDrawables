package DrawblesWithGeo;

import DrawblesWithGeo.Circle;
import DrawblesWithGeo.Rectangle;
import DrawblesWithGeo.Square;
import DrawblesWithGeo.Triangle;

public class Main {
    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue",4.0,6.0);
        Triangle triangle = new Triangle("Yellow",12.0,21.0);
        Square square = new Square("Crimson",77.0);


        circle.displayColor();
        circle.displayShapeType();
        System.out.println("Circle Area: " +circle.calculateArea());
        circle.drawShape();

        rectangle.displayColor();
        rectangle.displayShapeType();
        System.out.println("Rectangle Area: "+rectangle.calculateArea());
        rectangle.drawShape();

        triangle.displayColor();
        triangle.displayShapeType();
        System.out.println("Triangle Area: "+triangle.calculateArea());
        triangle.drawShape();

        square.displayColor();
        square.displayShapeType();
        System.out.println("Square Area: "+square.calculateArea());
        square.drawShape();

        drawingBoard.listDrawables();
    }
}
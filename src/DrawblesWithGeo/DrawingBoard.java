package DrawblesWithGeo;
import java.util.ArrayList;
import java.util.Scanner;
public class DrawingBoard implements Drawable {
    String shape;
    String color;
    double radius;
    double length;
    double width;
    double base;
    double height;
    double side;
    ArrayList<String> drawables = new ArrayList<>();
    Scanner sc = new Scanner(String.valueOf(System.out));
    Circle circle = new Circle(color, radius);
    Rectangle rectangle = new Rectangle(color,length,width);
    Triangle triangle = new Triangle(color,base, height);
    Square square = new Square(color, side);
    public void collectionOfDrawables() {
        drawables.add("Circle");
        drawables.add("Rectangle");
        drawables.add("Triangle");
        drawables.add("Square");
    }
    public void listDrawables() {
        for (int i = 0; i < drawables.size(); i++) {
            System.out.println(drawables.get(i));
        }
    }
    public void displayShapeType() {
        System.out.print("Enter shape type: ");
        shape = sc.nextLine();
        switch (shape) {
            case "Circle":
                circle.displayShapeType();
                break;
            case "Rectangle":
                rectangle.displayShapeType();
                break;
            case "Triangle":
                triangle.displayShapeType();
                break;
            case "Square":
                square.displayShapeType();
                break;
            default:
        }
    }
    @Override
    public void drawShape() {
        System.out.print("Enter shape type: ");
        shape = sc.nextLine();
        switch(shape) {
            case "Circle":
                circle.drawShape();
                break;
            case "Rectangle":
                rectangle.drawShape();
                break;
            case "Triangle":
                triangle.drawShape();
                break;
            case "Square":
                square.drawShape();
                break;
            default:
        }
    }
    @Override
    public void displayShape() {
        System.out.print("Enter shape type: ");
        shape = sc.nextLine();
        switch (shape) {
            case "Circle":
                circle.displayShape();
                break;
            case "Rectangle":
                rectangle.displayShape();
                break;
            case "Triangle":
                triangle.displayShape();
                break;
            case "Square":
                square.displayShape();
                break;
            default:
        }
    }
}
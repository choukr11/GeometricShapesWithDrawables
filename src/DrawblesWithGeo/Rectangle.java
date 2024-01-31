package DrawblesWithGeo;

class Rectangle extends  Shape{
    private double length;
    private double width;
    public Rectangle(String color, double length, double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
    @Override
    public void displayShapeType() {
        System.out.println("This is a Rectangle!");
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void displayShape() {
        System.out.println("Displaying Rectangle");

    }
}
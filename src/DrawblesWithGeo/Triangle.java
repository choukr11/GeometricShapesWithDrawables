package DrawblesWithGeo;

class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(String color, double base, double height){
        super(color);
        this.base= base;
        this.height=height;
    }
    @Override
    public double calculateArea(){
        return (base*height)/2;
    }

    @Override
    public void displayShapeType() {
        System.out.println("This is a Triangle!");
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void displayShape() {
        System.out.println("Displaying Triangle");

    }
}
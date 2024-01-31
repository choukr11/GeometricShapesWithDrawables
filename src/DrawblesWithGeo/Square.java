package DrawblesWithGeo;

class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double length) {
        this.side = length;
    }



    public Square(String color, double side){
        super(color);
        this.side=side;
    }
    @Override
    public double calculateArea(){
        return side*side;
    }

    @Override
    public void displayShapeType() {
        System.out.println("This is a Square!");
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing a Square");
    }

    @Override
    public void displayShape() {
        System.out.println("Displaying Square");

    }
}

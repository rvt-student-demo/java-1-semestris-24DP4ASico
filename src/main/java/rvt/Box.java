package rvt;

public class Box{
    private double length;
    private double height;
    private  double width;

    public Box(double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box(double side){       
        this.length = side;
        this.height = side;
        this.width = side;
    } 

    public Box(Box oldBox){
        this.length = oldBox.length;
        this.height = oldBox.height;
        this.width = oldBox.width;
    }


    public double length(){
        return this.length;
    }

    public double height(){
        return this.height;
    }

    public double width(){
        return this.width;
    }

    public double volume(){
        return length * height * width;
    }

    public double area(){
        return 2 * faceArea() + 2 * sideArea() + 2 * topArea();
    }


    public double faceArea(){
        return length*height;
    }

    public double sideArea(){
        return width*height;
    }

    public double topArea(){
        return width*length;
    }

    public Box biggerBox(Box oldBox){
        return new Box(
            1.25 * oldBox.length(),
            1.25 * oldBox.height(),
            1.25 * oldBox.width() );
    }
    public Box smallerBox(Box oldBox){
        return new Box(
            0.75 * oldBox.length(),
            0.75 * oldBox.height(),
            0.75 * oldBox.width() );
    }

    public boolean nests(Box outsideBox)
{
        return
        this.length < outsideBox.length()&&
        this.height < outsideBox.height() &&
        this.width < outsideBox.width();
}
}
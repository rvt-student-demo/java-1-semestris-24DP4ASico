package rvt;

public class Box{
    private double length;
    private double width;
    private  double height;
    private double topArea;
    private double sideArea;
    private double faceArea;



    public Box(double width, double length, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box oldBox){
        oldBox.length = this.length;
        oldBox.width = this.width;
        oldBox.height = this.height;
    }

    public Box biggerBox(Box oldBox){
        return new Box(1.25*oldBox.length,1.25*oldBox.width,
            1.25*oldBox.height );
    }
    public Box smallerBox(Box oldBox){
        return new Box(0.75*oldBox.length,0.75*oldBox.width,
         0.75*oldBox.height );
    }


    public Box(double side){
        this(side, side, side);
    }

    public double volume(){
        return width*length*height;
    }

    public double area(){
        return (width*length) + (width*height) + (length*height);
    }

    public double getlength(){
        return this.length;
    }

    public double getheight(){
        return this.height;
    }

    public double getwidth(){
        return this.width;
    }

    public double getfaceArea(){
        return length*height;
    }

    public double getsideArea(){
        return width*height;
    }

    public double gettopArea(){
        return width*length;
    }

}
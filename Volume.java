class Volume{
    public static void main(){
        Shape[] shape=new Shape[2];
        shape[0]=new Square(5);
        shape[1]=new Triangle(2,2);
        System.out.println("Volume of square:"+shape[0].getVolume());
        System.out.println("Volume of triangle:"+shape[0].getVolume());
    }
}
class Shape{
    public double getVolume(){
        return 0;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    public double getVolume(){
        return 0.5*base*height;
    }
}
class Square extends Shape{
    private double side;
    public Square(double side){
        this.side=side;
    }

    public double getVolume(){
        return side*side;
    }
}
package com.rishabh.Week5;

public class Shape {
    String color;
    boolean filled;
    Shape(){
        this.color = "green";
        this.filled = true;
    }
    Shape(String col,boolean fill){
        this.color = col;
        this.filled = fill;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        if(this.filled){
            System.out.println("A shape with color of "+ this.color + " and filled.");
        }else {
            System.out.println("A shape with color of " + this.color + " and not filled.");
        }
        return null;
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        Shape s1 = new Shape("Orange",true);
        s1.toString();
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Perimeter of circle is:" + c.getPerimeter(c.getRadius()));
        System.out.println("Area of circle is:" + c.getArea(c.getRadius()));
        c.toString(c.getRadius());
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(10);
        System.out.println("Perimeter of rectangle is:" + r.getPerimeter());
        System.out.println("Area of rectangle is:" + r.getArea());
        r.toString(r.getLength(),r.getWidth());
        Square sq = new Square(5);
        System.out.println("Perimeter of square is:" + sq.getPerimeter());
        System.out.println("Area of square is:" + sq.getPerimeter());
        sq.toString(r.getWidth());
    }


}

class Circle extends Shape{
    double radius;
    Circle(){
        this.radius = 1.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(double radius){
        return 3.14 * radius * radius;
    }
    public double getPerimeter(double radius){
        return 2 * 3.14 * radius;
    }

    public String toString(double radius){
        System.out.println("A circle with radius: " + radius +
                " which is a subclass of " + super.toString());
        return null;
    }

}

class Rectangle extends Shape{
    double width,length;
    Rectangle(){
        this.width = this.length = 1.0;
    }
    Rectangle(double width,double length){
        this.length = length;
        this.width = width;
    }
    Rectangle(double width,double length,String color,boolean fill){
        super(color,fill);
        this.length = length;
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

    public String toString(double len,double wid){
        System.out.println("A rectangle with width " + wid
        + " and length " + len + " which is the subclass of " +
                super.toString());
        return null;
    }
}

class Square extends Rectangle{
    Square(){
        super();
    }
    Square(double side){
        super(side,side);
    }
    Square(double side,String col,boolean fill){
        super(side,side,col,fill);
    }
    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }
    public String toString(double side){
        System.out.println("A square with side " + side + " which is the sub class of " + super.toString());
        return null;
    }
}


package com.rishabh.Week3;
/*
Define a class volume and then
find the volume and surface_area of a cube,
cylinder and rectangular box using method overloading.
 */
class Volume {
    double volume(double l){
        //for cube
        return l * l * l;
    }
    double volume(double l,double b,double h){
        //for rectangular box
        return l*b*h;
    }
    double volume (double r,double h){
        //for cylinder
        return (double) 3.14 * r * r * h;
    }

}

class Area{
    double area(double l){
        //for cube
        return 6*l*l;
    }

    double area(double l,double b,double h){
        //for rectangular box
        return 2 * (l*b + b*h + l*h );
    }

    float area(double r,double h){
        //for cylinder
        return (float) (3.14f * 2 * r * h);
    }

}

public class Question4 {
    public static void main(String[] args) {
        Volume c1 = new Volume();
        Area c2 = new Area();
        System.out.println("Area of Cube:" + c2.area(5));
        System.out.println("Volume of Cube:" + c1.volume(5));

        Volume c3 = new Volume();
        Area c4 = new Area();
        System.out.println("Area of rectangular box:" + c4.area(5,6,7));
        System.out.println("Volume of rectangular box:" + c3.volume(5,6,7));

        Volume c5 = new Volume();
        Area c6 = new Area();
        System.out.println("Area of Cylinder:" + c6.area(7,10));
        System.out.println("Volume of Cylinder:" + c5.volume(7,10));
    }
}

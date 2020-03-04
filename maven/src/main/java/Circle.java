import  java.util.Scanner;

public class Circle extends GeometricObj {

    Scanner scan = new Scanner(System.in);


    private double radius;

    public Circle() {
        shape = "Circle";
        radius = 5;

    }

    public Circle(double rad) {
      /*  System.out.println("Enter the radius");
        rad = scan.nextDouble();*/

        shape = "Circle";
        radius = rad;
    }

    public double circleArea(double radius) {

        area = Math.PI * radius * radius;
        return  area;
    }

    public double circlePerimeter(double radius) {

        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double surfaceArea(double radius){

        double surArea1 = Math.PI * radius *radius;
        return surArea1;


    }
}


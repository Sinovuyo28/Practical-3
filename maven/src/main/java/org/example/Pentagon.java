package org.example;

public interface Pentagon {

    String shape = "Pentagon";
    double length = 0;
    double apothem = 0;

    public double area(double length , double apothem);
    public double perimeter (double numberOfSides , double apothem);
    public  double surfaceArea(double length , double apothem);
}

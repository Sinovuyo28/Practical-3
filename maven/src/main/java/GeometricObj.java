public class GeometricObj {

    //declaring variables
    String shape;
    double area;
    double perimeter;
    double surfaceArea;

    public  GeometricObj(){

        shape = "unknown";
        area = 0;
        perimeter = 0;
        surfaceArea = 0;

    }

    public void showResults(){

        System.out.println("Shape: "+ shape);
        System.out.println("Result of area: "+ area);
        System.out.println("Perimeter: "+ perimeter);
        System.out.println("Surface Area: "+ surfaceArea);
    }
}

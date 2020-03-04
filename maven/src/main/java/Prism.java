import org.example.Pentagon;

public class Prism implements Pentagon {


    @Override
    public double area(double length, double apothem) {

        double areaActaual = (length * apothem)/2;
        return areaActaual;
    }

    @Override
    public double perimeter(double numberOfSides, double apothem) {
        double peri = numberOfSides * apothem;
        return peri;
    }

    @Override
    public double surfaceArea(double length, double apothem) {

        double surArea = perimeter(5, 4)*length + 2 * area(5 ,4);
        return surArea;
    }
}

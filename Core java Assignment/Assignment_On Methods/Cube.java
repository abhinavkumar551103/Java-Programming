public class Cube {
    double side;
    public double getArea(double side){
        return 4*side*side;
    }
    public double getTotalSurfaceArea(double side){
        return 6*side*side;
    }
    public double getVolume(double side){
        return side*side*side;
    }
    
}

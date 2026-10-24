public class Hermisphere {
    double radius;
    public double getCurvedSurfaceArea(double radius){
        return 2*Math.PI*radius*radius;
    }
    public double getTotalSurfaceArea(double radius){
        return 3*Math.PI*radius*radius;
    }
}

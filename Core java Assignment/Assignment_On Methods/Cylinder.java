public class Cylinder{
    
double height;
double radius;

public double getCurvedSurfaceArea(double height, double radi) {
    return 2 * Math.PI * radi * height;
}

public double getTotalSurfaceArea(double height, double radi) {
    return 2 * Math.PI * radi * (radi + height);
}

}

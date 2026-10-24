public class Cuboid {
    double length;
    double breadth;
    double height;
    public double getTotalSurfaceArea(double height,double length,double breadth){
        return 2*height*(length+breadth);
    }
}

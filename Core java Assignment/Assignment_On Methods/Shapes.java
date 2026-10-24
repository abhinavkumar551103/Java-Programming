public class Shapes {
public static void main(String[] args) {

    Rectangle r1 = new Rectangle();
    Square s1 = new Square();
    Circle c1 = new Circle();
    Cylinder cy1 = new Cylinder();
    Cube cube1 = new Cube();
    Cuboid cuboid1 = new Cuboid();
    Hermisphere h1 = new Hermisphere();

    // Rectangle
    r1.length = 15;
    r1.width = 16.5;
    System.out.println("Rectangle Area: " + r1.getArea(15, 16.5));
    System.out.println("Rectangle Perimeter: " + r1.getPerimeter(15, 16.5));

    // Square
    s1.side = 10;
    System.out.println("Square Area: " + s1.getArea(10));
    System.out.println("Square Perimeter: " + s1.getPerimeter(10));

    // Circle
    c1.radius = 5.565;
    System.out.println("Circle Area: " + c1.getArea(5.565));
    System.out.println("Circle Volume: " + c1.getVolume(5.565));

    // Cylinder
    cy1.height = 25;
    cy1.radius = 5;
    System.out.println("Cylinder Curved Surface Area: " + cy1.getCurvedSurfaceArea(25, 5));
    System.out.println("Cylinder Total Surface Area: " + cy1.getTotalSurfaceArea(25, 5));

    // Cube
    cube1.side = 25.6;
    System.out.println("Cube Area: " + cube1.getArea(25.6));
    System.out.println("Cube Total Surface Area: " + cube1.getTotalSurfaceArea(25.6));
    System.out.println("Cube Volume: " + cube1.getVolume(25.6));

    // Cuboid
    cuboid1.height = 30.35;
    cuboid1.breadth = 15.18;
    System.out.println("Cuboid Total Surface Area: " + cuboid1.getTotalSurfaceArea(30.35, 15.18, 15.8));

    // Hemisphere
    h1.radius = 45.57;
    System.out.println("Hemisphere Curved Surface Area: " + h1.getCurvedSurfaceArea(45.57));
    System.out.println("Hemisphere Total Surface Area: " + h1.getTotalSurfaceArea(45.57));
}

}

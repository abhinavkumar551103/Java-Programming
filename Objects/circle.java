public class circle {
    double radius;

    public void circleSerial(int n) {
        System.out.println("The circle number is : " + n);
    }

    public void setDetail(double r) {
        radius = r;
    }

    public void printArea() {
        System.out.println("The area of the circle is :" + 3.14 * radius * radius);
    }

    public void printCircumference() {
        System.out.println("The Circumference of the circle is :" + 2 * 3.14 * radius);
    }
}

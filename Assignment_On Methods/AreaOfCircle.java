import java.util.Scanner;

public class AreaOfCircle {

    public static String getDetails(double r){
        double area = 3.14*r*r;
        double circumference = 2*3.14*r;
        return "The area of a circle is "+area+" and the circumference is "+circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of a circle : ");
        double radius = sc.nextDouble();

        System.out.print(getDetails(radius));
        sc.close();
    }
}

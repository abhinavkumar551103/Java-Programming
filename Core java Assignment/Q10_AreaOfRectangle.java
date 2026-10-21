import java.util.Scanner;

public class Q10_AreaOfRectangle {
    public static String getDetails(double a,double b){
        double area = a*b ;
        double perimeter = 2*(a+b);
        return "The area of a rectangle is "+area+" and the perimeter is "+perimeter;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double len = sc.nextDouble();
        System.out.print("Enter the width : ");
        double width  = sc.nextDouble();

        System.out.print(getDetails(len,width));
        sc.close();
    
    }
}

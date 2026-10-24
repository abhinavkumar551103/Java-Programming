import java.util.Scanner;

public class CelciusToFer {

public static double FerTemp(double temp) {
    double fahrenheit = (temp * 9 / 5) + 32;
    return fahrenheit;
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the temp. in Celsius: ");
    double celcius = sc.nextDouble();

    double fer = FerTemp(celcius);

    System.out.println("The temp in Fahrenheit is: " + fer);

    sc.close();
}


}

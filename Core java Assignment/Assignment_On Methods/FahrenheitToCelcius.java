import java.util.Scanner;

public class FahrenheitToCelcius {
    public static double FerTemperature(double temp){
        temp = (temp - 32) * 5/9;
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature : ");
        double fahrenheit = sc.nextDouble();
        double celcius = FerTemperature(fahrenheit);
        System.out.print("The temperature in Fahrenheit is : "+celcius);

        sc.close();
    }
}

import java.util.Scanner;

public class Fahrenheit_to_Celsius{
	public static void main(String [] args){
	float cel,feh;
		Scanner input = new Scanner(System.in);
		
			
		System.out.print("Enter the Temperature in Fahrenheit: ");
		feh=input.nextFloat();
		
		cel=(feh-32)*5/9;
		
		System.out.println("\nThe Temperature in Celsius: "+cel);
		
	}
}
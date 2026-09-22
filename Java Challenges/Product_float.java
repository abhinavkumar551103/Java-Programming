import java.util.Scanner;

public class Product_float{
	public static void main(String[] args){
		float numOne, numTwo;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first point: ");
		numOne=input.nextFloat();
		
		System.out.print("Enter the Second point: ");
		numTwo=input.nextFloat();
		
		double product= numOne*numTwo;
		
		System.out.println("THE PRODUCT OF TWO FLOATING POINT NUMBER IS : " +product);
		
	}
}
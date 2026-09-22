import java.util.Scanner;

public class Parameter_Rectange{
	public static void main(String[] args){
		float length, breadth, Calc;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of rectange: " );
		length=input.nextFloat();
		
		System.out.print("Enter the breadth of rectange: " );
		breadth=input.nextFloat();
		
		Calc= 2*(length+breadth);
		
		
		System.out.print("The Area of Recatnge is now calculating \n\n");
		System.out.println("The area of Rectange is : "+Calc+"\n");
		
		
	}
}
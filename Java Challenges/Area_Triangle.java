import java.util.Scanner;

public class Area_Triangle{
	public static void main(String[] args){
		float height,base,area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Height: ");
		height=input.nextFloat();
		
		System.out.print("Enter the Base: ");
		base=input.nextFloat();
		
		area=0.5f*height*base;
		
		System.out.println("The Area of Triange is :  "+area);
		
		
	}
}
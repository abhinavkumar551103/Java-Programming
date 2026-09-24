import java.util.Scanner;

public class Odd_Even{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int num;
		
		System.out.print("CHECK RATHER THE NUMBER IS ODD OR EVEN\n\n");
		System.out.print("Enter the Number: ");
		num=input.nextInt();
		
		if(num%2==0){
			
			if(num==0){
				System.out.println("The number is Zero...");
			}
			else{
			 System.out.println("The number is Even...");
			 }
		}
		else{
			System.out.println("The number is Odd...");
		}
	}
}
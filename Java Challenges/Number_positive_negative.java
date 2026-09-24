import java.util.Scanner;

public class Number_positive_negative{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int num;
		
		System.out.print("CHECK RATHER TH NUMBER IS POSITIVE OR NEGATIVE\n\n");
		System.out.print("Enter the Number: ");
		num=input.nextInt();
		
		if(num>0){
			 System.out.println("The number is Positive...");
		}
		else if(num==0){
			System.out.println("The number is Zero...");
		}
		else{
			System.out.println("The number is Negative...");
		}
		
	}
}
import java.util.Scanner;

public class Compound_intrest{
	public static void main(String [] args){
		int Loan_amount;
		float rate,Cp,time;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Loan Amount: ");
		Loan_amount=input.nextInt();
		
		
		System.out.print("Enter the year or time/duration: ");
		time=input.nextFloat();
		
		
		System.out.print("Enter the Rate of Intrest: ");
		rate=input.nextFloat();
		
		Cp=Loan_amount*(1+rate/100)*time;
		System.out.println("The Compound Intrest is:" +Cp);
		
	}
}
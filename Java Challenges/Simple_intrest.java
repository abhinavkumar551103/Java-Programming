import java.util.Scanner;

public class Simple_intrest{
	public static void main(String [] args){
		int Loan_amount;
		float rate,si,time;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Loan Amount: ");
		Loan_amount=input.nextInt();
		
		
		System.out.print("Enter the year or time/duration: ");
		time=input.nextFloat();
		
		
		System.out.print("Enter the Rate of Intrest: ");
		rate=input.nextFloat();
		
		si=(Loan_amount*time*rate)/100;
		System.out.println("The Simple Intrest is:" +si);
		
	}
}
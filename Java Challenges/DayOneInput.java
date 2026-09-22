import java.util.Scanner;

public class DayOneInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //string add with sentance 

        // String Username = input.nextLine();
        // System.out.print("Welcome " +Username+ " to KG Coding");
    
        //addition of two numbers 
        System.out.println("ADDITION OF TWO NUMBER THROUGH INPUT FROM USER...");
        
        
        System.out.print("Enter the first number: ");
        int numOne = input.nextInt();

        System.out.print("Enter the Second number: ");
        int numTwo = input.nextInt();

        int sum=numOne+numTwo;
        System.out.println("the total of two number: "+sum);
        
    
    } 
}

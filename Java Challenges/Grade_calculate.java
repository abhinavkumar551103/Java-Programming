import java.util.Scanner;

public class Grade_calculate {
    public static void main(String [] args){
        int percentage;
        Scanner input =new Scanner(System.in);

        System.out.print("Enter Your Percentage ");
        percentage=input.nextInt();

        if(percentage>=90){
            System.out.println("The Grade is A: ");
        }
        else if(percentage>=75){
            System.out.print("The Grade is B: ");
        }
        else if(percentage>=60){
            System.out.print("The Grade is C: ");
        }
        else if(percentage>=30){
            System.out.print("The Grade is D: ");
        }
        else{
            System.out.print("The Grade is F: ");
        }

        input.close();
    }
    
}

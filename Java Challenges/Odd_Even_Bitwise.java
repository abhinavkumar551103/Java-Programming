import java.util.Scanner;

public class Odd_Even_Bitwise {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("ODD EVEN USING BITWISE OPERATOR ...\n");
        System.out.print("Enter the number: ");
        int numOne=input.nextInt();

        if((numOne & 1)==1){
            System.out.println("THE NUMBER IS ODD...");
        }
        else{
            System.out.println("THE NUMBER IS EVEN...");
        }
        input.close();
    }
}

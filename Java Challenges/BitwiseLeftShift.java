import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=input.nextInt();

        int result= num << 4 ;  //basically ye power ban jata hai hai number ki jaise number ki power 4 w.r.t 2
        System.out.println("RESULT OF LEFT SHIFT OF SHIFT-COUNT "+result);
        input.close();
    }
}

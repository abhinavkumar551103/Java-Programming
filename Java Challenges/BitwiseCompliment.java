import java.util.Scanner;

public class BitwiseCompliment {
        public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the number ");
        int numOne = input.nextInt();

        int result= ~ numOne;
        System.out.println("The Compliment result of two number "+result);

        input.close();
    }
}

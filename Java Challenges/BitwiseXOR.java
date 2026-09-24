import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("BITWISE XOR PROGRAM: \n");
        System.out.print("Enter the number: ");
        int first = input.nextInt();

        System.out.print("Enter the Second number");
        int second= input.nextInt();

        int result= first ^ second;
        System.out.println("THE BITWISE XOR OF TWO NUMBER: "+result);

    }
    
}

import java.util.Scanner;

public class Q7_LastDigitOfNumber {
    public static int LastDigit(int num){
        int digit = num%10;
        return digit; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int lastDigit = LastDigit(num);
        System.out.print("The last digit of a number is "+lastDigit);
    sc.close();
    }
}

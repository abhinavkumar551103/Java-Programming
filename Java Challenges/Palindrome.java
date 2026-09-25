import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();

        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("The number is Palindrome: ");
        } else {
            System.out.println("The number is not a  palindrome: ");
        }
        input.close();
    }

    public static boolean isPalindrome(int num) {
        int Reverse = ReverseOfDigit(num);
        return Reverse == num;
    }

    // REUABLILITY OF CODE,,,,..........

    public static int ReverseOfDigit(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;  //SEPRATE THE DIGITS
            newNum = newNum * 10 + digit;  
            num = num / 10;   //OR//  num /= 10;
        }
        return newNum;
    }

}

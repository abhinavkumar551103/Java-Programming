import java.util.Scanner;

public class ArmStrongNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        input.close();

        boolean isArmStrong = isArmStrongNumber(num);

        if (isArmStrong) {
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number is not Armstrong number");
        }
    }

    public static boolean isArmStrongNumber(int num) {
        int noOfDigits = NoOfDigits(num);
        int Copynum = num;
        int finalNumber = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            finalNumber = finalNumber + pow(lastDigit, noOfDigits);
            num = num / 10;
        }
        return finalNumber == Copynum;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result = result * num1;
            i++;
        }
        return result;
    }

    public static int NoOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        return digits;
    }
}

import java.util.Scanner;

public class Fibboncci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = input.nextInt();
        printFibonacci(num);
        input.close();

    }

    public static void printFibonacci(int num) {
        if (num < 0)
            return;
        if (num == 0)
            return;
        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + "  ");
            first = second;
            second = third;
        }
    }

}

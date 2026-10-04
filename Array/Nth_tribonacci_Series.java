import java.util.Scanner;

public class Nth_tribonacci_Series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth number: ");
        int n = sc.nextInt();


        int[] fib = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        System.out.print(fib[0] + " " + fib[1] + " " + fib[2] + " ");

        for (int i = 3; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2] + fib[i - 3];
            System.out.print(fib[i] + " ");
        }
        sc.close();
    }
}
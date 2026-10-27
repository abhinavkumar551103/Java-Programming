import java.util.Scanner;

class IO_Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        int sum = n1+n2;
        System.out.print("The sum of n1 and n2 is : "+sum);

    }
}
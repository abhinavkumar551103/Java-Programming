import java.util.Scanner;

class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit:" );
        int digit = sc.nextInt();
        while(digit != 0){
            System.out.println(digit%10);
            digit = digit/10;
        }
        sc.close();
    }
}

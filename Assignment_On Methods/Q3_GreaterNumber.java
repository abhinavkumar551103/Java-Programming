import java.util.Scanner;

class Q3_GreaterNumber{
    public static int greaterNumber(int a, int b){
        if(a>=b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The first number : ");
        int num1 = sc.nextInt();
        System.out.print("The second number : ");
        int num2 = sc.nextInt();

        int GreatNum = greaterNumber(num1, num2);
        System.out.print("The greater number is : "+GreatNum);

        sc.close();

    }
}
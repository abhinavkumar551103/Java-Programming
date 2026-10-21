import java.util.Scanner;
class Q1_ReturnAverageOfThreeNumbers{
    public static int getAvg(int a, int b, int c){
        int sum=a+b+c;
        int avg=sum/3;
        return avg;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number= ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number= ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number= ");
        int num3 = sc.nextInt();

        int avg = getAvg(num1,num2,num3);
        System.out.print("The average of the three digits is : "+avg);
        sc.close();
    }
}
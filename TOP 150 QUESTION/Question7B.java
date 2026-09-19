import java.util.Scanner;

public class Question7B {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third :");
        int num3 = sc.nextInt();
        if(num1 == num2 && num2 == num3){ 
            System.out.println("All are equal digits");
        }
            else if(num1 > num2 && num1 > num3)
                System.out.println("first is biggest");
            else if(num2>num3)
                System.out.println("Second is biggest");
            else
               System.out.println("Third is biggest");
    sc.close();
        }
}

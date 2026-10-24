import java.util.Scanner;

public class Q16_OddOREven {
    public static boolean OddEven(int a){
        if(a%2==0)
            return true;
        else 
            return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(OddEven(num))
            System.out.print("the number is even");
        else
            System.out.print("the number is odd");
    }
}

import java.util.Scanner;
public class DayOne_arthimetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numfirst;
        int numSecond;

        System.out.print("Enter the first number: ");
        numfirst=sc.nextInt();
        
        System.out.println("Enter the second number: ");
        numSecond=sc.nextInt();

        System.out.println("NOW THE ARTHMETIC OPERATIONS ARE");
        int sum= numfirst+numSecond;
        int sub= numSecond-numfirst;
        float division= numSecond/numfirst;
        int mul= numfirst*numSecond;


        System.out.println("The sum of num 1 and num 2 is : "+sum);
        System.out.println("The sub of num 1 and num 2 is : "+sub);
        System.out.println("The division of num 1 and num 2 is : "+division);
        System.out.println("The multiplication of num 1 and num 2 is : "+mul);

    }
}

import java.util.Scanner;

public class Question8 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the shopping amt :");
    int Shopping = sc.nextInt();
    if(Shopping >10000){
        double totalamt = Shopping * 0.6;
        System.out.println("Wow you get 40% OFF!!! ");
        System.out.println("The total amount you paid :"+totalamt);
    }
    else if(Shopping > 6000){
        double totalamt = Shopping * 0.7;
        System.out.println("Wow you get 30% OFF!!! ");
        System.out.println("The total amount you paid :"+totalamt);
    }
    else if(Shopping > 3000){
        double totalamt = Shopping * 0.8;
        System.out.println("Wow you get 20% OFF!!! ");
        System.out.println("The total amount you paid :"+totalamt);
    }
    else {
        double totalamt = Shopping * 0.92;
        System.out.println("Wow you get 8% OFF!!! ");
        System.out.println("The total amount you paid :"+totalamt);
    }
    sc.close();
   } 
}

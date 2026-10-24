import java.util.Scanner;

public class gstAndBill {
    public static double getBill(double amt, double gst){ 
        double totalBill = amt+gst;
        return totalBill;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        double amt = sc.nextDouble();
        System.out.print("Enter the gst applied on product in % : ");
        double gst = sc.nextDouble();

        gst = (amt/100)*gst;
        System.out.print("Your total bill is : "+(getBill(amt, gst)));

        sc.close();

    }
    
}

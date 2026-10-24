import java.util.Scanner;

public class Q17_PriceAndQuantity {

    public static double Price_Quantity(double quantity, double price){
        double totalAmt = quantity*price;
        return totalAmt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product name : ");
        sc.next();
        System.out.print("Enter the quantity of the product : ");
        double quantity = sc.nextDouble();
        System.out.print("Enter the price of the product : "); 
        double price = sc.nextDouble();

        double totalAmount = Price_Quantity(quantity, price);
        System.out.print("your total bill is : "+totalAmount); 
        sc.close();
    }
}

import java.util.Scanner;

public class Q2_ShirtDiscountPrices {
   public static double getPriceAfterDis(double prices,double discount){
      discount /=100;
      double disPrices = prices*discount;
      return prices - disPrices;
   } 
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the shirt prices : ");
    double Shirt_price = sc.nextDouble();

    System.out.print("The discount is applied of : ");
    double discount = sc.nextDouble();
    
    double After_Discount = getPriceAfterDis(Shirt_price,discount);
    System.out.print("The final prices after discount applied is : "+After_Discount);

    sc.close();
   } 
}

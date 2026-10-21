import java.util.Scanner;

public class Q8_Remove_LastDigit {

    public static int Remove_LastDigit(int a){
        int digit = a/10;
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int updateNum = Remove_LastDigit(num);
        System.out.print("The removal of last digit : "+updateNum); 
        sc.close();
    }
}

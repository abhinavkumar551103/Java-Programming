import java.util.Scanner;

public class Q4_SamllerNumber {
    public static int getSamllerNum(int a,int b){
        if(a<=b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1= sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        
        int smallerNumber = getSamllerNum(num1,num2);
        System.out.print("The samller number is : "+smallerNumber);
        sc.close();
    }
}

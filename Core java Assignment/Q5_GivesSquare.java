import java.util.Scanner;

public class Q5_GivesSquare {

    public static int sq(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sq = sq(num);
        System.out.print("The square Of a number "+sq);
    
        sc.close();

    }
}

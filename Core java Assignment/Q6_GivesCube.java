import java.util.Scanner;

public class Q6_GivesCube {

    public static int cube(int a){
        return a*a*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int cube = cube(num);
        System.out.print("The cube Of a number "+cube);
    
        sc.close();

    }
}

import java.util.Scanner;

class Question7A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num >0){
            System.out.println(num);
        }
        else{
            System.out.println(-num);
        }
        sc.close();

    }
}
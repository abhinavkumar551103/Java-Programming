import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {

        greet();

        Multiplication_table_Maker();
    }

    public static void greet() {
        System.out.println("WELCOME TO MULTIPLICATION WORLD...\n");
    }

    public static void Multiplication_table_Maker() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + (num * i));
            i++;
        }
        input.close();
    }

}



//RETRY TO BUILD UP  




/*import java.util.Scanner;

class Multiplication_table {
    public static void main(String[] args) {
        greet();
        Multiplication_table_Maker();

    }

    public static void greet() {
        System.out.print("WELCOME TO MUTLIPLICATION TABLE MAKER...\n");
    }

    public static void Multiplication_table_Maker() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + (num * i));
            i++;
        }
            input.close();
    }
}*/
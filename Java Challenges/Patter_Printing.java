import java.util.Scanner;

class Pattern_Printing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Pattern Printing...");
        System.out.print("Enter the number of Rows: ");
        int rows = input.nextInt();

        System.out.println("\nHere is the Right Half Pattern:\n");
        printingRightHalf(rows);

        System.out.println("\nHere is the Reverse Right Half Pattern:\n");
        printingReverseRightHalf(rows);

        System.out.println("\nHere is the Left Half Pattern:\n");
        printLeftHalfPattern(rows);

        input.close();
    }

    // Right Half Pyramid
    public static void printingRightHalf(int maxrow) {
        int row = 1;
        while (row <= maxrow) {
            int i = 1;
            while (i <= row) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    // Reverse Right Half Pyramid
    public static void printingReverseRightHalf(int maxrow) {
        int row = maxrow;
        while (row >= 1) {
            int i = 1;
            while (i <= row) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }

    // Left Half Pyramid
    public static void printLeftHalfPattern(int maxrow) {
        int row = 1;
        while (row <= maxrow) {

            // print spaces
            int space = 1;
            while (space <= maxrow - row) {
                System.out.print("  ");
                space++;
            }

            // print stars
            int star = 1;
            while (star <= row) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            row++;
        }
    }
}


//  BY THE USE OF FOR LOOPS





/* import java.util.Scanner;

class Pattern_Printing_For {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.println("\nRight Half Pattern:\n");
        printRightHalf(rows);

        System.out.println("\nReverse Right Half Pattern:\n");
        printReverseRightHalf(rows);

        System.out.println("\nLeft Half Pattern:\n");
        printLeftHalf(rows);

        input.close();
    }

    // Right Half Pyramid
    public static void printRightHalf(int n) {
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Reverse Right Half Pyramid
    public static void printReverseRightHalf(int n) {
        for (int row = n; row >= 1; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Left Half Pyramid
    public static void printLeftHalf(int n) {
        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // stars
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


*/




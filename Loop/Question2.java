import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit: ");
        int digit = sc.nextInt();
        
        while(digit != 0 ){
            int value = digit%10;
            if(value%2 == 0){
                System.out.println(value);
            }
        digit = digit/10;
        }
    }
    
}

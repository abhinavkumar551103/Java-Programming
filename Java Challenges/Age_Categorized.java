import java.util.Scanner;

public class Age_Categorized {
    public static void main(String [] args ){
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Categorized the persons as per Age:\n\n");
        System.out.print("Enter your age: ");
        age=input.nextInt();

    if(age<=13){
        System.out.println("The Person is Child...");
    }
    else if(age<=20){
        System.out.println("The Person is Under Teen...");
    }
    else if(age<=60){
        System.out.println("The person is Adult...");
    }
    else{
        System.out.println("The person is Senior Citizen");
    }
    input.close();

    } 
}

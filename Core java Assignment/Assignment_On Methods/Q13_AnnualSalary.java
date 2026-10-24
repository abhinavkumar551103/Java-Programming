import java.util.Scanner;

public class Q13_AnnualSalary {
    public static int getAnnualSalary(int sal){
        int Annualsal = sal*12;
        return Annualsal;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int sal =sc.nextInt();
        System.out.println("The annual package is : "+getAnnualSalary(sal));
        sc.close();
    }
    
}

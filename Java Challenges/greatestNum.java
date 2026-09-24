import java.util.Scanner;

class GreatestNumber{
    public static void main(String [] args){
        int numOne,numTwo,numThree;
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the number A: ");
        numOne=input.nextInt();

    
        System.out.print("Enter the number B: ");
        numTwo=input.nextInt();

        
        System.out.print("Enter the number C: ");
        numThree=input.nextInt();

      if(numOne>=numTwo && numOne>=numThree){
    System.out.println("Number A is Greater "+numOne);
      }
      else if (numTwo>=numOne && numTwo>=numThree){
        System.out.println("Number B is Greater "+numTwo);
      } 
      else{
        System.out.println("Number C is Greater "+numThree);
      }

    }
}
public class Question5 {
    public static void main(String[] args) {
        int year = 1900;
        if(year%400==0){
            System.out.println(year+" Year is a Leap year");
        }
        else if(year%100==0){
            System.out.println(year +" Year is not a Leap year");
        }
        else if(year%4==0){
            System.out.println(year+" Year is a Leap year");
        }
        else{
            System.out.println("Year is not a leap year");
        }
    }
}

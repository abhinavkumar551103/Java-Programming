public class SumOfNumRange {
    public static void main(String[] args){
        int m=10, n=20;
        System.out.println("The sum of Range from " +m+" to "+n+" is "+getSumOfNumRange(m,n));
    }
    public static int getSumOfNumRange(int starts,int ends){
       int sum = 0;
        for(int i=starts;i<=ends;i++){
            sum+=i;
        }
        return sum;
    }

}

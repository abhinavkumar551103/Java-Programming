public class FactorialOfn {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(getFactorial(num));
    }
    public static int getFactorial(int n){
        if(n==0){
            return 0;
        }
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}

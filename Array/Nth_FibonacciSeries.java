public class Nth_FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int[] fib = new int[n+1];
        fib[0]=0;
        fib[1]=1;
        if(n==0){
            System.out.println(fib[0]);
        }
        else if(n<=1){
            System.out.println(fib[0]+" "+fib[1]);
        }
        for(int i=2;i<fib.length;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        for(int x:fib){
            System.out.println(x);
        }
    }
}

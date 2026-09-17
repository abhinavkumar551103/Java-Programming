class sumOfnum{
    public static int getSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        int n=50;
        System.out.println(getSum(n));
    }
}
class Power{
    public static void main(String[] args){
        int num = 8, times = 3;
        System.out.println(getpower(num, times));
    }
    public static int getpower(int a,int b){
        int pow = 1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        return pow;
    }
}
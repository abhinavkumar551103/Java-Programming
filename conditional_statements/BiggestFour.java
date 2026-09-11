public class BiggestFour {
    public static void main(String[] args){
        int a=10,b=50,c=30,d=20;
        int max = (a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d)?c:d;
        System.out.println(max);
    }
    
}

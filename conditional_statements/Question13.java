public class Question13 {
    public static void main(String[] args){
        int a=10,b=30,c=20;
        int maximum = (a>b && a>c)?+a:(b>c && b>a)?+b:(c>a && c>b)?+c:00;
        int minimum = (a<b && a<c)?+a:(b<a && b<c)?+b:(c<a && c<b)?+c:00;
        int total = a+b+c;
        int secondMax = total -maximum-minimum;
        System.out.println("The Second minimum number is :"+secondMax);
    }
}

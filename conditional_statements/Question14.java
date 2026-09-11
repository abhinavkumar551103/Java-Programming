public class Question14 {
    public static void main(String[] args) {
        int a=9,b=2,c=7;
        int max = (a>b && a>c)?a: (b>c)?b:c;
        int min = (a<b && a<c)?a: (b<c)?b:c;
        int mid = (a+b+c) - max - min;
        System.out.println(+min+" "+mid+" "+max);
    }
    
}





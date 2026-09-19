public class Swap {
    public static void main(String[] args) {
    int a=100, b=500;
    System.out.println(a);
    System.out.println(b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("============================================================");
        System.out.println(a);
        System.out.println(b);
    }
}

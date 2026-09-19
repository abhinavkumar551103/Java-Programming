public class Question2C {
    public static void main(String[] args) {
    int a=10000, b=8000;
    System.out.println("The number A is :"+a);
    System.out.println("The number B is :"+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("============================================================");
        System.out.println("The number A is :"+a);
        System.out.println("The number B is :"+b);
    }
}

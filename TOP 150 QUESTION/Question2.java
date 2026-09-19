class Question2{
    public static void main(String[] args) {
        int num1 = 1000, num2 = 500, temp;
        System.out.println("Number A is :" +num1);
        System.out.println("Number B is :" +num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("============================================");

        System.out.println("Number A is :" +num1);
        System.out.println("Number B is :" +num2);

    }
}
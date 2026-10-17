public class calculatorDriver {
    public static void main(String[] args) {
        calculator calc = new calculator();
        int sum = calc.Add(10,20,30,40,50,60,70,80);
        int sub = calc.Subtract(sum, 250);
        int mul = calc.Multiplication(10,50,80,75,38);
        int sqroot = calc.SquareRoot(5);
        int CubeRoot = calc.CubeRoot(5);

        System.out.println("The addition of all the digits is : "+sum);
        System.out.println("The subtraction from sum is : "+sub);
        System.out.println("The multiplication of all the digit is : "+mul);
        System.out.println("The squre Root of the the digit is : "+sqroot); // digit is 5
        System.out.println("The Cube Root of the digit is : "+CubeRoot); // digit is 5
    }
}

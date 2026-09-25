import java.util.Scanner;

class Array_SumAndAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = avg(numArray);
        System.out.println("the sum of all digits: " + sum);
        System.out.println("the average of a digits: " + avg);
        input.close();
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int avg(int[] numArray) {
        int avg = (int) (sum(numArray) / numArray.length);
        return avg;
    }

}
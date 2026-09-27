public class Nth_primeNumber {

    public static void main(String[] args) {

        int n = 10;

        int[] arr = new int[n];

        int count = 0;
        int num = 2;

        while (count < n) {

            if (isPrime(num)) {
                arr[count] = num;
                count++;
            }

            num++;
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }
}
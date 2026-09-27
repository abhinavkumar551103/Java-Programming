public class CountPalindrome {

    public static void main(String[] args) {

        int[] arr = {10, 121, 66a, 57, 2020, 1975, 35, 353, 100};

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int original = num;
            int rev = 0;

            while (num > 0) {

                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            if (rev == original) {
                System.out.println(original);
            }
        }
    }
}
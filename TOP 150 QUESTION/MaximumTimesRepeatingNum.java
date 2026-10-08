class MaximumTimesRerpeatingNum {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 15, 10, 8, 12, 15, 16, 8, 15, 14, 8, 10, 8, 13, 8 };
        int min = 0, max = 0;
        for (int x : arr) {
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }

        int[] Freq = new int[max - min + 1];

        for (int n : arr) {
            Freq[n - min]++;
        }

        int count = 1;
        int number = 0;
        for (int i = 0; i < Freq.length; i++) {
            if (Freq[i] > count) {
                count = Freq[i];
                number = i + min;
            }
        }
        System.out.print("The highest frequency number is : "
                + count + " times, the actual number is " + number);
    }
}
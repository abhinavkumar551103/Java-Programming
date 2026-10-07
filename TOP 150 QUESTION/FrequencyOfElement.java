class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 22, 22, 15, 16, 15, 16, 9, 26, 28, 15, 21, 10, 20, 15, 18, 28, 9, 15 };
        int min = 0, max = 0;

        for (int n : arr) {
            if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }

        int[] Freq = new int[max - min + 1];
        
        for (int n : arr) {
            Freq[n - min]++;
        }
        for(int x: Freq){
            System.out.print(x +" ");
        }
    }
}
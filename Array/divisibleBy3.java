class divisibleBy3 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 70, 44, 77, 66, 856, 36, 96 };
        int sum = 0;
        for (int n : nums) {
            if (n % 3 == 0) {
                sum += n;
                System.out.println(n + " ");
            }
        }
        System.out.print("The sum of all " + sum);
    }
}
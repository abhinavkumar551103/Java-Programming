public class Sort_the_0_and_1 {

    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 0, 0, 1, 0, 0, 1};

        int low = 0, high = nums.length - 1;

        while (low <= high) {

            if (nums[low] == 0) {
                low++;
            }

            else if (nums[low] == 1) {
                swap(nums, low, high);
                high--;
            }
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    public static void swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
public class SelectionSort {
    static void main(String[] args) {
        int[] nums = {95,35,65,44,77,88,99,12,16,15,25,18,65,10};
        Selection_Sort(nums);
        System.out.println("Sorted Array is: ");
        for(int n: nums){
            System.out.print(n+" ");
        }
    }
    public static int[] Selection_Sort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int MinIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    MinIndex=j;
                }
            }
            arr[MinIndex] = arr[i];
            arr[i] = min;
        }
        return arr;
    }
}

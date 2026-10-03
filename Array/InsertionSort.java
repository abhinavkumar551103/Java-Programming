
public class InsertionSort{
    static void main(String[] args) {
        int[] nums = {12,15,11,66,18,15,10,8,5,0};
        insertion_Sort(nums);
        for(int n: nums){
            System.out.print(n+" ");
        }
    }
    public static int[] insertion_Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int pivot = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>pivot){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=pivot;
        }
        return arr;
    }
}


















class BubbleSort {
    public static void main(String[] args){
        int[] nums ={10,50,30,70,65,95,66,99,77,11,0,18,15,59};
        bubbleSort(nums);
        System.out.println("Sorted Array is :");
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    //swap;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

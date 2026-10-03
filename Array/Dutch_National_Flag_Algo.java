public class Dutch_National_Flag_Algo {
    static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,2,2,0,1,1,1,1,0,0,0,2,2,2,0};
        Sort_it(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    public static int[] Sort_it(int[] a){
        int mid=0,end=a.length-1,start=0;
        while(mid<=end){
            if(a[mid]==0){
                swap(a,start,mid);
                start++;
                mid++;
            } else if (a[mid]==1) {
                mid++;
            }
            else{
                swap(a,end,mid);
                end--;
            }
        }
        return a;
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

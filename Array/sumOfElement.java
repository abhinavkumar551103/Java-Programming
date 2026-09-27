public class sumOfElement {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {98,75,65,93,85,47,74,56} ;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The total sum of all elements : "+sum);
    }
}

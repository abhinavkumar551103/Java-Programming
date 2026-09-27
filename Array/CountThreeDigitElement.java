public class CountThreeDigitElement {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {10,20,105,100,65,605,501,503,555,888,978};
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=100 && arr[i]<=999){
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.print("\n the total numbers are : "+count);
    }
}

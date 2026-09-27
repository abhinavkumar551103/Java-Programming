public class AverageOfElement {
    public static void main(String[] args) {
        int[] arr = new int[]{10,50,60,80,75,68,95,28,82,73,24};
        int sum=0, count=0,avg;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
        }
        avg = sum/count;
        System.out.println("The Average of all Elements : "+avg);
    }
}

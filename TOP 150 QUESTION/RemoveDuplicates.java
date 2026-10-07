public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10,11,12,12,11,10,14,10,14,11,15};
        int max=0; 
        int min=0;
        for(int n: arr){
            if(n>max){
                max=n;
            }
            else if(n<min){
                min=n;
            }
        }
        int[] Freq = new int[max-min+1];
        for(int n: arr){
            Freq[n-min]++;
        }
        for(int i=0;i<Freq.length;i++){
            if(Freq[i]>1){
                System.out.println((i+min)+" is : "+Freq[i]+" Times.");
            }
        }
    }
}

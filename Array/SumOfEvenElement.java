public class SumOfEvenElement {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[]{75,65,88,98,47,87,22,60,30,86};
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }

        }
        System.out.println("The sum of Even digits is : "+sum);
    }
    
}

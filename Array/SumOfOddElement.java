public class SumOfOddElement {
    public static void main(String[] args) {
        int sum = 0;
        int[] marks = new int[]{75,65,88,98,47,87,22,60,30,86};
        for(int i = 0;i<marks.length;i++){
            if(marks[i]%2!=0){
                sum+=marks[i];
            }

        }
        System.out.println("The sum of Odd digits is : "+sum);
    }
    
}

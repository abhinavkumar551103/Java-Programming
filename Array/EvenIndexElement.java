class EvenIndexElement {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
     //   System.out.println(arr); // address of array
        for(int i = 0;i<arr.length;i++){
            if(i%2 == 0){
                System.out.println(+arr[i]);
            }
        }
    }    
}

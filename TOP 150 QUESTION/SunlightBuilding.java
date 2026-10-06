public class SunlightBuilding {
    static void main(String[] args) {
        int[] arr = {4, 2, 6, 8, 5, 7, 12, 6};
        boolean sunlight = true;
        int max=arr[0];
        System.out.println("Building gets sunlight properly are :"+max);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<max){
                sunlight = false;
            }
            else {
                max = arr[i];
                sunlight = true;
                System.out.println("Building gets sunligh properly are : "+arr[i]);
            }
        }
    }
}

class SunlightBuildingPartB {
    public static void main(String[] args) {
    int[] arr = {4, 2, 6, 8, 5, 7, 12, 6};
    int max=arr[0];
    boolean sunlight = true;
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
            System.out.print(i + " ");
            }

        }
    }
}

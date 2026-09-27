public class CountEvenElement {
    public static void main(String[] args) {
        double[] Mileage = {10.5,12.5,15.5,16.5,20.0,16.0,11.0,10.0,22.0};
        int count = 0;
        for(int i = 0;i<Mileage.length;i++){
            if(Mileage[i]%2==0){
                count++;
                System.out.print(" "+Mileage[i]);
            }
        }
        System.out.print(" \n "+"counts are: "+count); 
    }
}

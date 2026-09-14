public class Question7 {
    public static void main(String[] args) {
        int shopping =5000;
        double pay;
        if(shopping>=10000){
            System.out.println("WOW! You get 40% discount");
            pay = shopping*0.6;
            System.out.println("You should pay only "+pay);
        }
        else if(shopping>=6000){
            System.out.println("WOW! You get 30% discount");
            pay = shopping*0.7;
            System.out.println("You should pay only "+pay);
        }
        else if(shopping>=3000){
            System.out.println("WOW! You get 20% discount");
            pay = shopping*0.8;
            System.out.println("You should pay only "+pay);
        }
        else{
            System.out.println("WOW! You get 8% discount");
            pay = shopping*0.92;
            System.out.println("You should pay only "+pay);
        }
    }
}

public class Question4 {
    public static void main(String[] args){
        int side1=45 ,side2=45 , side3=30 ;
        if( side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
            System.out.println("Triange is formed");
        }
        else{
            System.out.println("Triange is not formed");
        }
    }    
}

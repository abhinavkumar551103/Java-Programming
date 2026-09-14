public class Question2 {
    public static void main(String[] args){
        int a=10,b=50,c=30;
        if(a==b && b==c){
            System.out.println("All value are equal");
        }
        else if(a>b && a>c){
            System.out.println("The A is bigger number: "+a);
        }
        else if(b>c){
            System.out.println("The B is bigger number: "+b);
        }
        else{
            System.out.println("The C is bigger number: "+c);
        }
    }    
}

class Question3{
    public static void main(String[] args){
        char character = 'A';
        if(character>='a' && character<='z' || character>='A' && character<='Z'){
            System.out.println(character+" Its a valid character");
        }
        else{
            System.out.println(character+" Its Not a valid character");
        }
    }
}
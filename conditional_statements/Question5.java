class Question5{
    public static void main(String[] args){
        int num = 8;
        String result = (num%3==0 && num%5==0)?"Number is divisible by 3 and 5 both":(num%3==0)?"The number is divisible by 3":(num%5==0)?"Number is divisible by 5":"Number is NOT divisible by 3 and 5 or both";
        System.out.println(result);
    }
}
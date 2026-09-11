class Leap{
    public static void main(String[] args){
        int year = 2028;
        String res = (year%400 == 0)?"Year is Leap year":(year%100 == 0)?"Year is not a Leap year":(year%4==0)?"Year is Leap year":"Year is not a leap year";
        System.out.println(res);
    }
}
class SamllestNumThree {
    public static void main(String[] args){
        int num1 = 10, num2 = 20, num3 = 30;
        String res = (num1 == num2 && num2== num3)?"All are equals":(num1<num2 && num1<num3)?"Number 1 is Smaller":(num2<num1 && num2<num3)?
        "Number 2 is Smaller":(num3<num1 && num3<num2)?"Number 3 is Smaller":(num1==num2 || num2==num3 || num1==num3)?"The two number value is same":"Not a number";
        System.out.println(res);
    }
    
}

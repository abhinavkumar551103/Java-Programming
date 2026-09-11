class BiggerNum{
    public static void main(String[] args){
        int numA = 10, numB = 5;
        String res = (numA == numB)?"Number A and B is are equal":(numA>numB)?"Number A is greater":"Number B is greater";
        System.out.println(res);
    }
}
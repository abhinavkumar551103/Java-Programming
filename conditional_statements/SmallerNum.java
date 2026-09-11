class SmallerNum{
    public static void main(String[] args){
        int numA = 25, numB = 65;
        String res = (numA == numB)?"Number A and B is are equal":(numA<numB)?"Number A is Smaller":"Number B is Smaller";
        System.out.println(res);
    }
}
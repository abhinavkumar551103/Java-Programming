class question3{
    public static void main(String[] args){
        int CutRequired = 6;
        int result = (CutRequired == 1)? 0:(CutRequired%2 == 0)?CutRequired/2:CutRequired;
        System.out.println(result);
    }
}
class Question3{
    public static void main(String[] args){
        int x = 2 ,y = 5 ,z = 6;
        int dist1 = (z-x);
        int dist2 = (z-y);
        String result = (dist1<dist2)?" x is first arrived":" y is first arrived";
        System.out.println(result);
    }
}
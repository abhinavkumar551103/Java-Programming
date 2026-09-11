class Triangle {
    public static void main(String[] args){
        int sideA = 5, sideB = 7, sideC = 8;
        String res = ((sideA+sideB)>sideC && (sideB+sideC)>sideA && (sideC+sideA)>sideB)?"The Triangle is valid formed":"The triangle is not able to form";
        System.out.println(res);
    }
}
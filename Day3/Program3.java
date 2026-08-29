class Program3 {

    public static void main(String[] args) {
        String s1 = "Mohan is Here";
        String s2 = "Mohan";
        String s3 = "mohan";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(11));
        System.out.println(s1.charAt(s1.length()-1));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(2,7));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.codePointAt(0));

    }
}
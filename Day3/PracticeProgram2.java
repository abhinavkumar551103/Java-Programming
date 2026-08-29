class PracticeProgram2 {
    public static void main(String[] args){
        String s1 = "Java Class";
        String s2 = "JAVA CLASS";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.substring(2)); // to end string prints from starting index to end
        System.out.println(s1.substring(2,5));
        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equalsIgnoreCase(s2)); // true ignore the upper case match only letters
    }
}

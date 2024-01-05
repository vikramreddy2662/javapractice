package JavaProblems;

public class compareToString {
    public static void main(String[] args){
        String s="vikram";
        String s1="vikram ";
        System.out.println(s.compareTo(s1));//compares two strings returns +ve if true and -ve if false
        s=s.replace('a','e');
        System.out.println(s);
        System.out.println(s.startsWith("a"));
        System.out.println(s.startsWith("v"));
        System.out.println(s.replaceAll("v","j"));
        System.out.println(s.endsWith("m"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(" " +s);
        System.out.println(s.trim());
        System.out.println();
        System.out.println(s.isEmpty());
        System.out.println(s.length());



    }
}

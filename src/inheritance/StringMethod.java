package inheritance;

import java.lang.String;

public class StringMethod {
    public static void main(java.lang.String[] args) {
        java.lang.String name = "Harry";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);
        java.lang.String lstring = name.toLowerCase();
        System.out.println(lstring);

        java.lang.String ustring = name.toUpperCase();
        System.out.println(ustring);

        java.lang.String nonTrimedstring = "Harry";
        System.out.println(nonTrimedstring);

        String Trimedstring = nonTrimedstring.trim();
        System.out.println(Trimedstring);
    }
}



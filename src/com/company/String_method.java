package com.company;

import java.util.Locale;

public class String_method {
    public static void main(String[] args) {
        String a = "biswajit";
        //   String a1 =new.String("biswait");
        //int value = a.length();
        String biswajit = a.toLowerCase();
        System.out.println(biswajit);
        String biswajitd = a.toUpperCase();
        System.out.println(biswajitd);

        String nonTrimmedString = "    biswajitbb   tty ";
        System.out.println(nonTrimmedString.trim());
        System.out.println(a.substring(5));
        System.out.println(a.replace('i','5'));

        System.out.println(a.startsWith("bisw"));
        System.out.println(a.endsWith("jit"));

        System.out.println(a.charAt(5));
        System.out.println(a.indexOf("w"));
        System.out.println(a.indexOf("w",4));
        System.out.println(a.lastIndexOf("sw"));
        System.out.println(a.lastIndexOf("sw",3));

        System.out.println(a.equals("biswajit"));
        System.out.println(a.equals("bisWAjit"));
        System.out.println(a.equalsIgnoreCase("bisWAjit"));
        System.out.println("vcxvccx \\ tegfefre");//escape sequence
        System.out.println("vcxvccx \n tegfefre");//escape sequence
        System.out.println("vcxvccx \t tegfefre");//escape sequence
    }

}

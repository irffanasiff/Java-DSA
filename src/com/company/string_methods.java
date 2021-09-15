package com.company;

import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
/*
        String str = new String(" Intellij ");
        int len = str.length();
        System.out.println(len);

        String str2 = str.toUpperCase();
        System.out.println(str2);

        String str3 = str.trim();
        System.out.println(str3);

        String str4 = str.substring(3,7);
        System.out.println(str4);

        String str5 = str.replace('i', 'e');
        System.out.println(str5);
*/
        String string1 = "Mr. Shahrukh Khan";
        System.out.println(string1.startsWith("Mr."));

        System.out.println(string1.charAt(4));
        for (int i = 0; i < string1.length(); i++) {
            System.out.print(string1.charAt(i));
        }
    }
}

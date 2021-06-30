package com.Bridgelabs.BoosterBootCampProgram.Day4;

import java.util.Arrays;

public class StringFunctions {

   
    public static void checkPalindrome(String str) {
        String rev = "";

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
 

    public static String Anagram(String str1, String str2) {
 
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;

        
        if (s1.length() != s2.length()) {
            status = false;
        } 
        else
        {
           
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
           

            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
        return "";
    }
}

package com.Bridgelabs.BoosterBootCampProgram.Day4;

import java.util.Scanner;

public class Palindrom
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        Utility.checkPalindrome(str);

    }
}
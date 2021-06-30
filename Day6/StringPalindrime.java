package com.Bridgelabs.BoosterBootCampProgram.Day6;
import java.util.Scanner;

public class StringPalindrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      String stri, reverse = "";
		      Scanner sc = new Scanner(System.in);
		 
  System.out.println("Enter a string:");
 stri = sc.nextLine();
		 
   int length = stri.length();
		 
    for ( int i = length - 1; i >= 0; i-- )
    	reverse = reverse + stri.charAt(i);
		 
 if (stri.equals(reverse))
		System.out.println(stri+" is a palindrome");
		  else
		 System.out.println(stri+" is not a palindrome");
		 
		   }
		}

package com.Bridgelabs.BoosterBootCampProgram.Day5;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        int i =1;
        int fact =1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number = sc.nextInt();
        MathFunction.Factorial(number,i,fact);
    }
}
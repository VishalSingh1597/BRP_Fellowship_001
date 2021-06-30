package com.Bridgelabs.BoosterBootCampProgram.Day5;

import java.util.Scanner;

public class cosineAngle
{
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(MathFunction.cosineAngle(number));
    }
}
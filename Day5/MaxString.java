package com.Bridgelabs.BoosterBootCampProgram.Day5;

import java.util.Arrays;
import java.util.Scanner;

public class MaxString
{
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
        System.out.println("Enter the names");
        for (int i = 0;i < array.length;i++)
        {
            array[i] =sc.nextLine();
        }
        System.out.println(Arrays.toString(array));
        MathFunction.MaxString(array);
    }
}
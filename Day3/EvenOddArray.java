package com.Bridgelabs.BoosterBootCampProgram.Day3;

public class EvenOddArray {

	 public static void main(String[] args) {

	  int[] array = new int[] {3,2,5,4,6,7,1};

	  int evenPnt = 0;
	  
	  // Arranging Even and Odd numbers
	  for (int i = 0; i < array.length; i++) 
	  {
	   if (array[i] % 2 == 0) {
	    swap(array, evenPnt, i);
	    evenPnt++;
	   }
	  }
	  
	  sort(array, 0, evenPnt);
	  
	  sort(array, evenPnt, array.length);

	  for (int i : array) {
	   System.out.print(i+", ");
	  } 
	 }

	 public static void sort(int[] arr, int min, int max) 
	 {
	  for (int i = min; i < (max - 1); i++)
	  {
	   for (int j = i + 1; j < max; j++) 
	   {
	    if (arr[i] > arr[j]) 
	    {
	     swap(arr, i, j);
	    }
	   }
	  }
	 }

	 public static void swap(int[] arr, int i, int j) {
	  int tmp = arr[i];
	  arr[i] = arr[j];
	  arr[j] = tmp;
	 }
	}
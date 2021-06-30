package com.Bridgelabs.BoosterBootCampProgram.Day1;

public class MyProgram 
{
	public int[] reverse()
		{
		
     			int [] arr = new int [] {2, 4, 3, 5, 6, 7};  
			int [] arr2 = new int[6];
 		        System.out.println("Given array: ");  
		        for (int i = 0; i < arr.length; i++) 
     			   {  
      			      System.out.print(arr[i] + " ");  
     			   }  
     			System.out.println();  
      		        System.out.println("Array in reverse order: ");  
      		       for (int i = arr.length-1; i >= 0; i--)
     			   {  
    		    	    System.out.print(arr[i] + " ");
				arr2[i] = arr[i];
      		   	   }
			  return arr2;
		}

       public int oddPositionSorting(int[] num)
        {

		int OddSum = 0;

		for(int i = 0; i < 6; i++)
			{
				if(num[i] % 2 != 0)
					{
						OddSum = OddSum + num[i]; 
					}
			}		
			System.out.println("\n The Sum of Odd Numbers :" + OddSum);
		return OddSum;
        	
        }



        public int intoTen(int num)
        {
        	int ans=num*10;
        	return ans;
        }


	public int cubeNum(int num)
	{
		
int a, sum = 0;
int numCopy = num;
    
 
          

    while(numCopy > 0)

    {

        a = numCopy % 10;

      
    a=a*a*a;
    sum = sum +a;

        numCopy = numCopy / 10;


    }
System.out.println("The sum of the cube of single digit from the number is "+sum);
return sum;


	}
        
       
	 public static void main(String[] args) 
		    {  
        		MyProgram a=new MyProgram();
			int[] reverseNum = new int[6];
        		int oddPositionNum,intoTenNum,finalNum;
        	
        		reverseNum=a.reverse();
        		oddPositionNum=a.oddPositionSorting(reverseNum);
        		intoTenNum=a.intoTen(oddPositionNum);
			finalNum = a.cubeNum(intoTenNum);
		

		    }

  }

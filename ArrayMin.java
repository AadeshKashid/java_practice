package com.test;

public class ArrayMin {

	public static void main(String[] args) 
	{
		
		int arr  [] = {100,2000,700,7000};

        int minnum = arr[0];

        for (int i = 0; i < arr.length; i++) 
        { 
        
               if (arr[i] < minnum) 
            
                minnum = arr[i];
            
        }

        System.out.println("Minimum number = " + minnum);

	}

}
// ================================
// Output:- Minimum number = 100.



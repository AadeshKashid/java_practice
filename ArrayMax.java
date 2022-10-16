package com.test;

public class ArrayMax {

	public static void main(String[] args) {
		
		int arr  [] = {20,30,40,50};

		        int maxnum = arr[0];

		        for (int j = 0; j < arr.length; j++) 
		        { 
		        
		               if (arr[j] > maxnum) 
		            
		                maxnum = arr[j];
		            
		        }

		        System.out.println("Maximum number = " + maxnum);
		    }
		}
// =========================================
// Output:- Maximum number = 50.




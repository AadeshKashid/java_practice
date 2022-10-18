/* WAP to calculate the sum of the array element.
// int [][] arr = {
                        {10,20,30},
                        {40,50,60},
                        {70,80,90}
                       };
                       
*/

package com.test;

public class SumMulArray {

	public static void main(String[] args) {
		 
		int [][] arr  = {{10,20,30},
						{40,50,60},
						{70,80,90}
						};
		int add =0;
		for(int i=0;i<3;i++)            //this is for row          
		{																
			for(int j=0;j<3;j++)   		 //this is for column
			{
				add = add + arr[i][j];	//addition of arr i and arr j
				
				//System.out.println(add);
			}
			//System.out.println(add);
		}
		System.out.println("The sum of total array element is="+add);					
	
	}

}
//======================================================================
// Output:- The sum of total array element is=450


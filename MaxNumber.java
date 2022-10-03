package com.test;

public class MaxNumber {
	
	public static void main(String [] args) {
	
		int p = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		int s = Integer.parseInt(args[3]);
		
		if(p>q) {
			
		if(p>r) {
		
		if(p>s)	{
			
			System.out.println("p is greater");
		}
		}		
		}
	if(q>r) {
		if(q>s) {
			if(q>p) {
				System.out.println("q is greater");
			}
				
			}
		}
	if(r>q) {
		if(r>s) {
			if(r>p) {
				System.out.println("ris greater");
	
	}
}

}
	if(s>r) {
		if(s>q) {
			if(s>p) {
				System.out.println("s is greater");
	}
}
	}
	}
}

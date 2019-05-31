package junk2;

import conditional.Package_Test;
//import conditional.*;
public class Sorting {
	 static int gcd(int a, int b) 
	    { 
	        if (a == 0) 
	            return b; 
	        return gcd(b % a, a); 
	    } 
	    
	    static int findGCD(int arr[], int n) 
	    { 
	        int result = arr[0]; 
	        for (int i = 1; i < n; i++) 
	            result = gcd(arr[i]/2, result); 
	  
	        return result; 
	    } 

	public static void main(String[] args) {
		
		 int arr[] = { 2, 4, 6, 8, 10 }; 
	        int n = arr.length; 
	        System.out.println(findGCD(arr, n)); 
	        
		// Below is the calling form another package
	        
	        Package_Test PT = new Package_Test();
	        PT.a();
		
	}

}

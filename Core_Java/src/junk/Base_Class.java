package junk;

import java.util.*;

//System.out.println
public class Base_Class {
	// below is the program for the next large element 
	
	public static void prioritizedOrders(int numOrders, List<String> orderList) 
	{
	    
	    Collections.sort(orderList);
	    System.out.println(orderList);
	}
	public static void main(String[] args) {
		// here is the input of the array
		 int Number = 6;
		    //
		    String[] orderList = {"zid 93 12","fp kindle book","10a echo", "17g 12 25 6", "ab1 kindle book", "125 echo dot second generation"};
		    List<String> names = Arrays.asList(orderList);
		    Base_Class.prioritizedOrders(Number, names);
		
	}
	
            
            
        }
    
        
    


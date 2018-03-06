package com.bridgeit.utility;

public class FactorialProgram {
	/**
	    * Function to find factorial
	    *
	    * @param number to find factorial of a number
	    */
	   
	public int factorialNumber(int number) {
		if(number==0)
			return 1;
		else
	return(number*factorialNumber(number-1));
}


}

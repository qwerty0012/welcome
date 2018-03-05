package com.bridgeit.utility;

public class FactorialProgram {
	public int factorialNumber(int number) {
		if(number==0)
			return 1;
		else
	return(number*factorialNumber(number-1));
}


}

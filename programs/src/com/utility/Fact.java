package com.utility;

public class Fact {
	public int fact(int n) {
		if(n==0)
			return 1;
		else
	return(n*fact(n-1));
}
	}
package com.bridgeit.utility;

import java.util.Scanner;

public class HarmonicNumberProgram {
	/**
	    * Function to print harmonic value
	    *
	    * @param number to find harmonic value
	    */
	   
public int harmonicNumber(int number)
{
	double sum=0.0;
	for(int i=1;i<=number;i++)
	{
		sum=sum+(1.0/i);
		
	}
	System.out.println(sum);
	return number;
		}


}


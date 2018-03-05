package com.bridgeit.utility;

public class PowerOfTwoProgram {
public int findingPower(int number)
{
	int power=1;
	for(int i=0;i<number;i++)
	{
			System.out.println("2^"+i+"="+power);
		    power=2*power;
	}
	  if(number%4==0)
		{
			System.out.println("Entered number is a leap year");
		}

	return number;
}
}

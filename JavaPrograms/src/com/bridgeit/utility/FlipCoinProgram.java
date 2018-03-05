package com.bridgeit.utility;

public class FlipCoinProgram {
	public int coinTossed(int number)
	{
		int countOfHead=0;
		int countOfTail=0;
		double headPercent=0.0;
	    double tailPercent=0.0;
		for(int i=0;i<number;i++)
		{
			double f=Math.random();
			if(f<0.5)
			{
				countOfHead=countOfHead+1;
			}
			else
			{
				countOfTail=countOfTail+1;
			}
		}
System.out.println(headPercent=countOfHead/ number * 100);
System.out.print(tailPercent=countOfTail/ number* 100);
return number;

	}

}

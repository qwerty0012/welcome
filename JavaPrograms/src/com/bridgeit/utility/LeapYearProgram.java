package com.bridgeit.utility;

public class LeapYearProgram {
	/**
	    * Function to check leap year
	    *
	    * @param year to find entered year is leap or not
	    */
	
	public int leap(int year)
	{
		if(year>=1000 && year%4==0)
		 System.out.print("enter year is leap year");
	    else 
	     System.out.print("enter year is not leap year");
		 return year;
}


}

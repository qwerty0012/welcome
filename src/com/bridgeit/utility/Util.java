package com.bridgeit.utility;

public class Util {
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


		/**
		    * Function to find out flip coin and percentage of head and tail
		    *
		    * @param number for flip coin
		    */
		   
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
	System.out.println(headPercent=(100*countOfHead)/100);
	System.out.print(tailPercent=(100*countOfTail)/100);
	return number;

		}

		
		/**
		    * Function to print number of wins and percentage of win or loss
		    *
		    * @param stake the gambler start with a stake
		    * @param goal gambler set a goal
		    * @param number number of times gambler want to play
		    */
		
		public int gamblerWinOrLose(int stake,int goal,int number)
		{
			int win=0;
			int loss=0;
			int percentageOfWin=0;
			int percentageOfLoss=0;
			for(int i=0;i<number;i++)
			{
				if(Math.random()<0.5)
					stake=stake+1;
				else stake=stake-1;
			
			if(stake==goal)
			{
				win=win+1;
		        percentageOfWin=(100*win)/number;

			}
			else
			{
				loss=loss+1;
				percentageOfLoss=(100*loss)/number;

			}

			}
			System.out.println("win="+win);
			System.out.println("percentage of win="+percentageOfWin);
	 	    System.out.println("loss="+loss);
			System.out.println("percentage of loss="+percentageOfLoss);

			return number;
		}


		
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


	
	/**
	    * Function to replace string with user entered string
	    *
	    * @param name input string
	    * @param replaceWordOfGivenString replace the word of user choice
	    * @param replaceWordWithUserChoice user entered String
	    */
	   
	public void helloUser(String name,String  replaceWordOfGivenString,String replaceWordWithUserChoice)
	{
		if(name.length()>3) {
		String s3=name.replace( replaceWordOfGivenString,replaceWordWithUserChoice);
		System.out.print(s3);
			}

	}

	
	
	
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
	
	
	/**
	    * Function print table of power of two also check the entered number is leap year or not
	    *
	    * @param number to print table of power of two and to check the given number is leap or not
	    */
	
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


/**
 * Function to find prime factorization of a given number
 *
 * @param number user input to find out prime factorisation
 */

public int primeFactorial(int number)
{
	int i=2;
	while(number>1)
	{
		if(number%i==0)
		{
			System.out.println(i);
			number=number/i;
		}
		else
			i=i+1;
	}
	return number;
}



/**
 * Function to find distinct coupon number
 *
 * @param number different coupon number
 */


public int searchDistinctNumber(int couponNumbers,int number)
{
	for(int i=0;i<Math.random();i++)
	{
		if(couponNumbers==number)
		{
			System.out.println("no new number");
		}
		else
		{
			System.out.println("distinct number");
			
		}
	}
	return number;
}

	
}

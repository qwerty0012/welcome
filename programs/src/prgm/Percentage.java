package prgm;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of how many time coin tossed");
		int a=s.nextInt();
	
		int hCount=0;
		int tCount=0;
		double hPercent=0.0;
	    double tPercent=0.0;
		for(int i=0;i< a;i++)
		{
			double f=Math.random();
			if(f<0.5)
			{
				hCount=hCount+1;
			}
			else
			{
				tCount=tCount+1;
			}
		}
System.out.println(hPercent=hCount/ a * 100);
System.out.print(tPercent=tCount/ a * 100);
	}

}

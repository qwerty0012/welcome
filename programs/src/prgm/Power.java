package prgm;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter a number");
int a=sc.nextInt();
for(int i=0;i<a;i++)
{
	int a2=2*i;
	if(a2==a && a%4==0)
	{
		System.out.println("2^"+i+" is leap year");
	}
	else
	{
		System.out.println("2^"+i+"="+a2);
	}
}
	}

}

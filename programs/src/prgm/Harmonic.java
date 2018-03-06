package prgm;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.print("enter a number");
int n=s.nextInt();
double sum=0.0;
for(int i=1;i<=n;i++)
{
	sum=sum+(1.0/i);
	
}
System.out.println(sum);
	}

}

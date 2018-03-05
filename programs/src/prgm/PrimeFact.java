package prgm;

import java.util.Scanner;

public class PrimeFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
		int n=sc.nextInt();
		while(n%2==0)
		{
			System.out.print(2);
			n=n/2;
		}

	}

}

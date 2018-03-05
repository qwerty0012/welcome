package prgm;

import java.util.Scanner;

import com.utility.Fact;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number");
		int n=s.nextInt();
		Fact ut=new Fact();
		System.out.println("factorial of a number is"+ut.fact(n));

	}

}

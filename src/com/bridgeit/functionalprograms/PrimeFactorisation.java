package com.bridgeit.functionalprograms;

import java.util.Scanner;
import com.bridgeit.utility.Util;

public class PrimeFactorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number to find its prime factors");
		int number=scanner.nextInt();
		Util prime=new Util();
		prime.primeFactorial(number);
		
		
		
	}

}

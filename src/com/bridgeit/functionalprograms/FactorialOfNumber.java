/******************************************************************************
 *  
 *  Purpose: To find factorial of a given number
 *
 *  @author  Pragati
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.functionalprograms;

import java.util.Scanner;


import com.bridgeit.utility.Util;


public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number to find factorial");
		int number=s.nextInt();
		Util factorial=new Util();
		System.out.println("factorial of a number is"+factorial.factorialNumber(number));

	}

}

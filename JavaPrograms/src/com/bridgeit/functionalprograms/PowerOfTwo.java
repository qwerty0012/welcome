/******************************************************************************
 *  
 *  Purpose: To print table of power of two and to check entered number is leap or not
 *
 *  @author  Pragati
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.functionalprograms;

import java.util.Scanner;

import com.bridgeit.utility.PowerOfTwoProgram;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter a number");
		int number=scanner.nextInt();
		PowerOfTwoProgram power=new PowerOfTwoProgram();
		power.findingPower(number);

	}

}

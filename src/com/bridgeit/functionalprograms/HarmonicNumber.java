/******************************************************************************
 *  
 *  Purpose: To calculate nth harmonic value
 *
 *  @author  Pragati
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.functionalprograms;

import java.util.Scanner;
import com.bridgeit.utility.Util;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to find harmonic value");
		int number=scanner.nextInt();
		Util harmonic=new Util();
		harmonic.harmonicNumber(number);
			}

	}



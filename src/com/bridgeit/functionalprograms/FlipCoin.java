/******************************************************************************
 *  
 *  Purpose: To find out flip coin and percentage of head and tail
 *
 *  @author  Pragati
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/


package com.bridgeit.functionalprograms;

import java.util.Scanner;
import com.bridgeit.utility.Util;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of tossed coin");
		int number=s.nextInt();
		Util flip=new Util();
		flip.coinTossed(number);
	
	}

}

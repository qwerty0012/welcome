/******************************************************************************
 *  
 *  Purpose: Simulates a gambler to print number of wins and percentage of win or loss
 *
 *  @author  Pragati
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/


package com.bridgeit.functionalprograms;

import java.util.Scanner;
import com.bridgeit.utility.Util;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the stake");
		int stake=scanner.nextInt();
		System.out.println("enter the goal user want to set");
		int goal=scanner.nextInt();
        System.out.println("enter the number of times gambler want to play");
		int number=scanner.nextInt();
		Util gambler=new Util();
		gambler.gamblerWinOrLose(stake,goal,number);

	}

}

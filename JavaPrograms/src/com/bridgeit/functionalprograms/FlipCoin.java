package com.bridgeit.functionalprograms;

import java.util.Scanner;

import com.bridgeit.utility.FlipCoinProgram;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of tossed coin");
		int number=s.nextInt();
		FlipCoinProgram flip=new FlipCoinProgram();
		flip.coinTossed(number);
	
	}

}

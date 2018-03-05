package com.bridgeit.functionalprograms;

import java.util.Scanner;

import com.bridgeit.utility.HarmonicNumberProgram;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number");
		int number=s.nextInt();
		HarmonicNumberProgram harmonic=new HarmonicNumberProgram();
		harmonic.harmonicNumber(number);
			}

	}



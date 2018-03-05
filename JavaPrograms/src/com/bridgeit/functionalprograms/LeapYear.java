package com.bridgeit.functionalprograms;

import java.util.Scanner;

import com.bridgeit.utility.LeapYearProgram;


public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter a year");
		int year=scanner.nextInt();
		LeapYearProgram leapYear=new LeapYearProgram();
		leapYear.leap(year);

	}

}

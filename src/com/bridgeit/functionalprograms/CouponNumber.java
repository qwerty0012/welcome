package com.bridgeit.functionalprograms;

import java.util.Scanner;

import com.bridgeit.utility.Util;


public class CouponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the number of coupons");
    	int couponNumbers=scanner.nextInt();
    	System.out.println("coupon numbers are");
    	for(int i=0;i<couponNumbers;i++)
    	{
    	int coupon=scanner.nextInt();
    	int a[]=new int[coupon];
    	}
     	System.out.println("Enter a number you want to check");
        int number=scanner.nextInt();
		Util coupon=new Util();
        coupon.searchDistinctNumber(couponNumbers,number);
	}

}

package prgm;

import java.util.Scanner;

import com.utility.Leap;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.print("enter a year");
int a=s.nextInt();
Leap li=new Leap();
li.leap(a);
	}

}

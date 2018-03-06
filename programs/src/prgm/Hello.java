package prgm;

import java.util.Scanner;



public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello username how are you";
		Scanner sc=new Scanner(System.in);
System.out.println("select the word of a string you want to replace");
String s1=sc.next();
System.out.println("enter the word you want to replace");
String s2=sc.next();
if(s.length()>30 ) {
String s3=s.replace(s1, s2);
System.out.print(s3);
	}

	}
}

/******************************************************************************
 *  
 *  Purpose: Replace a string with user entered String
 *
 *  @author  Pragati
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.functionalprograms;

import java.util.Scanner;
import com.bridgeit.utility.Util;

public class HelloUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Hello username how are you";
		Scanner scanner=new Scanner(System.in);
		System.out.println("select the word of a string you want to replace");
		String replaceWordOfGivenString=scanner.next();
		System.out.println("enter the word you want to replace");
		String replaceWordWithUserChoice=scanner.next();
		Util hello=new Util();
		hello.helloUser(name, replaceWordOfGivenString,replaceWordWithUserChoice);

	}

}

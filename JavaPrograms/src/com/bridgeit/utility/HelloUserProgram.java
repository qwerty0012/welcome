package com.bridgeit.utility;

public class HelloUserProgram {
	public void helloUser(String name,String  replaceWordOfGivenString,String replaceWordWithUserChoice)
	{
		if(name.length()>3) {
		String s3=name.replace( replaceWordOfGivenString,replaceWordWithUserChoice);
		System.out.print(s3);
			}

	}

}

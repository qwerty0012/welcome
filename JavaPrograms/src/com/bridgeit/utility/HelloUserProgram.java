package com.bridgeit.utility;

public class HelloUserProgram {
	/**
	    * Function to replace string with user entered string
	    *
	    * @param name input string
	    * @param replaceWordOfGivenString replace the word of user choice
	    * @param replaceWordWithUserChoice user entered String
	    */
	   
	public void helloUser(String name,String  replaceWordOfGivenString,String replaceWordWithUserChoice)
	{
		if(name.length()>3) {
		String s3=name.replace( replaceWordOfGivenString,replaceWordWithUserChoice);
		System.out.print(s3);
			}

	}

}

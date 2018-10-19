package com.qa.Exc1;

import java.util.Arrays;

public class Exc1Adv {
	
	public static void main(String[]args) {
	
	//String[] myarr = { "hi", "my", "name", "is", "xav"};
	//	Arrays.stream(myarr).map((word) -> word + "!").forEach(System.out::print);
		
		
		
	String[] arr = new String[] {"one", "1", "2", "ab"};
	Arrays.stream(arr).filter((word) -> word.length()<=2).filter((word) -> {
		try{
			Integer.parseInt(word);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}).map((word)-> Integer.parseInt(word)).map((num) -> num*10).reduce((current, total) -> current+total)
	.ifPresent(System.out::println);
	}
}
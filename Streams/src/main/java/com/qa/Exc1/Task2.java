package com.qa.Exc1;

import java.util.Arrays;

public class Task2 {
	
	public static void main(String[]args) {
		
		String[] arr = new String[] { "A123", "B111", "C453", "C3331", "D3456", "D2245", "C111", "A1", "B22"};
		
		
		Arrays.stream(arr).filter((word) -> !word.startsWith("D"))
		.map(word -> 
		{ if (word.startsWith("A")) {
			
			return (Integer.parseInt(word.replace("A", "")))*2;
		}
		else if (word.startsWith("B")) {
			return (Integer.parseInt(word.replace("B", ""))) + 100;
		}
		
		else if (word.startsWith("C")) {
			return (Integer.parseInt(word.replace("C", ""))) - 100;
		}
		return null;
		}).filter((num) -> !((num%5) == 0)).reduce((current, max) -> {
		if (current >= max) {
			max = current;
		}
		return max;
		})	.ifPresent(System.out::println);
		

}
}
		
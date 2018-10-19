package com.qa.Exc1;

public class Task3 {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1,10,50, 3, 4, 20,5,7 , 23, 56, 45,78,100,12,54,99 };
		
		ConvertNumToWords ctm = new ConvertNumToWords();
		ctm.convertToString(arr);

	}
}

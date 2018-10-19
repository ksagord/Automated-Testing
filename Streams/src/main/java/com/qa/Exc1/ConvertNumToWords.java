package com.qa.Exc1;

import java.util.Arrays;

public class ConvertNumToWords {
	
	
	public void convertToString(Integer[] arr) {
		Arrays.stream(arr).map(i -> numToWords(i)).sorted().map(word -> 
		{if (word.endsWith("-") == true ) {
			return (word.replace("-", ""));
		}
					return word;
		}).forEach(System.out::println);
		}
	
	
	public String numToWords( Integer i) {
		String wNum="";
		if (i==100) return "One-Hundred";
		if (i<10 || i>19) {
			switch (i/10) {
			case 2: wNum += "Twenty-";
			break;
			case 3: wNum += "Thirty-";
			break;
			case 4: wNum += "Forty-";
			break;
			case 5: wNum += "Fifty-";
			break;
			case 6: wNum += "Sixty-";
			break;
			case 7: wNum += "Seventy-";
			break;
			case 8: wNum += "Eighty-";
			break;
			case 9: wNum += "Ninety-";
			break;
			}
			switch (i%10) {
			case 1: wNum += "One";
			break;
			case 2: wNum += "Two";
			break;
			case 3: wNum += "Three";
			break;
			case 4: wNum += "Four";
			break;
			case 5: wNum += "Five";
			break;
			case 6: wNum += "Six";
			break;
			case 7: wNum += "Seven";
			break;
			case 8: wNum += "Eight";
			break;
			case 9: wNum += "Nine";
			break;
			}
		}
		if (i<=10) {
			switch(i) {
			case 0: wNum += "Zero";
			break;
			case 10: wNum += "Ten";
			break;
			case 11: wNum += "Eleven";
			break;
			case 12: wNum += "Twelve";
			break;
			case 13: wNum += "Thirteen";
			break;
			case 14: wNum += "Fourteen";
			break;
			case 15: wNum += "Fifteen";
			break;
			case 16: wNum += "Sixteen";
			break;
			case 17: wNum += "Seventeen";
			break;
			case 18: wNum += "Eighteen";
			break;
			case 19: wNum += "Nineteen";
			break;
			}
		}
		return wNum;
	}

}

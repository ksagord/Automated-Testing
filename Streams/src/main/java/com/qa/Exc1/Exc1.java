package com.qa.Exc1;

import java.util.ArrayList;

public class Exc1 {

	public static void main(String[] args) {
		
		String[] arr = new String[] {"one", "1", "2", "ab"};
		ArrayList<String> al = new ArrayList<String>();
		int sum = 0;
		
		
		for ( int i = 0 ; i<arr.length ; i++ ) {
			al.add(arr[i]);				
			}
		for (int q = 0 ; q<al.size();q++) {
			if(al.get(q).length()>2) {
				al.remove(q);
			}
		}
		for (String word : al) {
			try{
				int number = Integer.parseInt(word);
				sum = sum +number;
				
			}	
			catch(NumberFormatException e){
			}
	
	}
		
		System.out.println(sum*10);
	}
}




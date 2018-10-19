package com.qa.Exc1;

import java.util.ArrayList;

public class da {

	static ArrayList checkPrime(Integer[] arr2) {

		int i, m = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int p=0; p<arr2.length ; p++) {
			m = arr2[p] / 2;

			if (arr2[p] == 0 || arr2[p] == 1) {
				System.out.println(arr2[p] + " is not prime number");
			}
			else {
				for (i = 2; i <= m; i++) {
					if (arr2[p] % i == 0) {					
					}
				else  {
					System.out.println(arr2[p] + " is prime number");
					arr.add(arr2[p]);
					System.out.println(arr2[p]);
				}
			} // end of else

	
		}

		}
		return arr;

	}

	public static void main(String args[]) {
		Integer[] arr = new Integer[] { 1,4, 10, 50, 3};

		System.out.println(checkPrime(arr).toString());
	}
}

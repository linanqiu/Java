/*
Puzzle given on: https://projecteuler.net/problem=2
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

package org.javaiw.main;

public class Fibonacci {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		int z=1;
		int sum=0;
		
		while(x<4000000){
			x = y + z;
			z = y;
			y = x;
			if(x<4000000) {
				System.out.println(x);
				if (x%2==0) {
					sum= sum + x;
					System.out.println("sum is: " + sum);
				}
			}
		}

	}

}

package org.javaiw.typecasting;

public class TCArray {

	public static void main(String[] args) {
		int arr[];
		arr = new int[10];
		for(int x: arr){
			System.out.println(x);
		}
		System.out.println("Printed first array and now printing second array");
		
		
		int a[] = new int[]{12, 52, 31, 62, 4542, 16323, 623, 625, 723, 6214, 735};
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}

}

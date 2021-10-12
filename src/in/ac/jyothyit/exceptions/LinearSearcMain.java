package in.ac.jyothyit.exceptions;

import java.util.Scanner;

public class LinearSearcMain {
	public static void main(String args[]) {
		int n,x;
		int[] k = new int[20];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of elements in the array:");
		n = scanner.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			k[i] = scanner.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		x = scanner.nextInt();
		scanner.close();
		
		try {
			LinearSearch.search(k, x);
			System.out.println("Key Found");	
		}
		catch(KeyNotFoundException knfe){
			System.out.println("no there bye");
		}
	}

}

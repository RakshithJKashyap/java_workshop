package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 3 Numbers:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		System.out.println("Largest of the 2:" + findMaximum(a,b));
		System.out.println("Largest of the 3:" + findMaximum(a,b,c));
		scanner.close();
		
	}
	
	public static int findMaximum(int a, int b) {
		if(a>b)
			return a;
		else 
			return b;
	}
	
	public static int findMaximum(int a, int b,int c) {
		if (a>b && a>c) {
			return a;
		}
		else if(b>c && b>a) {
			return b;
		}
		else {
			return c;
		}
	}

}

package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class MinMain {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 3 Numbers:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		System.out.println("Smallest of the 2:" + Minimum.findMinimum(a,b));
		System.out.println("Smallest of the 3:" + Minimum.findMinimum(a,b,c));
		scanner.close();
		
	}
}

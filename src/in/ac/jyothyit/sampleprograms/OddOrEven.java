package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class OddOrEven {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num;
		num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.print("Eevn");
		}
		else {
			System.out.print("Odd");
		}
		
		scanner.close();
		
	}

}

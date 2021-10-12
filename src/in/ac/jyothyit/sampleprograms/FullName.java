package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class FullName {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String first,last;
		System.out.print("Enter First Name:");
		first = scanner.next();
		System.out.print("Enter Last Name:");
		last = scanner.next();
		System.out.print("Full Name:");
		System.out.print(first+" "+last);
		scanner.close();
	}

}

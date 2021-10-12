package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class VowelOrConsonent {
	public static void main(String args[]) {
	String letter;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the Letter:");
	letter = scanner.next();
	if (letter=="a"||letter.equals("a")||letter.equals("A")||letter.equals("e")||letter.equals("E")||letter.equals("i")||letter.equals("I")||letter.equals("o")||letter.equals("O")||letter.equals("A")||letter.equals("u")||letter.equals("U")){
		System.out.print("Vowel");
	}
	else {
		System.out.print("Consonant");
	}
	scanner.close();
	}

}

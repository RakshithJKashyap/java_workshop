package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num,sum=0;
		System.out.print("Enter the n number to add: ");
		num = scanner.nextInt();
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
//		while(num!=0) {
//			sum += num;
//			num--;
//		}
		System.out.print("Sum: "+ sum);
		scanner.close();
	}
}

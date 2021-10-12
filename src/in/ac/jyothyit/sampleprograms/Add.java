package in.ac.jyothyit.sampleprograms;

import java.util.Scanner;

public class Add {
		public static void main(String Args[]) {
			int a,b,sum;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter first no:");
			a = scanner.nextInt();
			System.out.print("Enter Second no:");
			b = scanner.nextInt();
			sum = a+b;
			System.out.print("Sum:"+ sum);
					
			
			//a=10;
			//b=12;
			//s=a+b;
			//System.out.println("a="+a+"b="+b+"Sum="+s);
		}

}

package in.ac.jyothyit.oops;

import java.util.Scanner;


public class CircleMain {
	public static void main(String args[]) {
		int radius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Radius:");
		radius = scanner.nextInt();
		Circle circle = new Circle(radius);
		System.out.println("Perimeter:"+ circle.findPerimeter());
		System.out.println("Area:"+ circle.findArea());
		scanner.close();
	}

}

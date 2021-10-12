package in.ac.jyothyit.oops;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String args[]) {
		int side1,side2,side3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 sides of the triangle:");
		side1 = scanner.nextInt();
		side2 = scanner.nextInt();
		side3 = scanner.nextInt();
		Triangle triangle = new Triangle(side1,side2,side3);
		System.out.println("Perimeter:"+ triangle.findPerimeter());
		System.out.println("Area:"+ triangle.findArea());
		scanner.close();
	}
}

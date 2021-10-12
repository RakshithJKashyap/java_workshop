package in.ac.jyothyit.procedural;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String args[]) {
		int side1,side2,side3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 sides of the triangle:");
		side1 = scanner.nextInt();
		side2 = scanner.nextInt();
		side3 = scanner.nextInt();
		System.out.println("Perimeter:"+ Triangle.findPerimeter(side1,side2,side3));
		System.out.println("Area:"+ Triangle.findArea(side1,side2,side3));
		scanner.close();
	}

}

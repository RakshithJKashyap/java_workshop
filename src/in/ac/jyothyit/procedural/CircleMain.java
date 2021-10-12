package in.ac.jyothyit.procedural;

import java.util.Scanner;

public class CircleMain {
	public static void main(String args[]) {
		int radius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Radius:");
		radius = scanner.nextInt();
		System.out.println("Perimeter:"+ CircleAreaPerimeter.findPerimeter(radius));
		System.out.println("Area:"+ CircleAreaPerimeter.findArea(radius));
		scanner.close();
		
	}

}

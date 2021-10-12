package in.ac.jyothyit.procedural;
import java.lang.Math;


public class Triangle {
	public static double findPerimeter(int side1, int side2, int side3){
		return side1+side2+side3;		
	}
	
	public static double findArea(int side1, int side2, int side3) {
		double s;
		s=(side1+side2+side3)/2;
		return (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
	}
}

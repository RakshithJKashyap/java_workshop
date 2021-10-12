package in.ac.jyothyit.oops;
import java.lang.Math;

public class Triangle {
	private int side1,side2,side3;
	 
	public Triangle(int side1,int side2,int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double findPerimeter() {
		return side1+side2+side3;
	}
	
	public double findArea() {
		double s,area;
		
		s = ((side1+side2+side3)/2);
		
		area = s*(s-side1)*(s-side2)*(s-side3);
		return Math.sqrt(area);
	}

}

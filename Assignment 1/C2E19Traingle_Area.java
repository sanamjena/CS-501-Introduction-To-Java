import java.util.*;

public class C2E19Traingle_Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3 = 0.0;
		System.out.println("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		double semiperimeter = (side1 + side2 + side3)/2;
		double value = (semiperimeter*(semiperimeter - side1)*(semiperimeter - side2)*(semiperimeter - side3));
		double area = Math.pow(value, 0.5);
		
		System.out.println("The area of the triangle is "+area);
		
	}

}

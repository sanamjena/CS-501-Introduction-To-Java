import java.util.*;

public class C4E2Radians {

	public static void main(String[] args) {
		double r = 6371.01, dist,x,y,x1,y1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		sc.close();

		x = Math.toRadians(x);
		y = Math.toRadians(y);
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);

		dist = 	r * Math.acos((Math.sin(x) * Math.sin(x1)) + (Math.cos(x) * Math.cos(x1) * Math.cos(y - y1)));
		System.out.println("The distance between the two points is " + dist);
	
	}

}

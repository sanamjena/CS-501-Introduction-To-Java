import java.util.*;

public class C3E27Point_In_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p1,p2,x,y;
		System.out.println("The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0) and (0, 100). ");
		System.out.println("Enter the point whose location is to found out, x- and y-coordinates: ");
		p1 = sc.nextDouble();
		p2 = sc.nextDouble();
		
		sc.close();
		
		x = (-p1 * (200 * 100)) / (-p2 * 200 - p1 * 100);
		y = (-p2 * (200 * 100)) / (-p2 * 200 - p1 * 100);
		
		if(p1>x || p2>y) {
			System.out.println("The point is not in the triangle");
		}
		
		if(p1<x || p2<y) {
			System.out.println("The point is in the triangle");
		}
	}

}

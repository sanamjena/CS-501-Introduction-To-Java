import java.util.*;

public class C2E15Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1,y1,x2,y2 = 0.0;
		System.out.println("Enter x1 and y1: ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		double val1 = (x2-x1)*(x2-x1);
		double val2 = (y2-y1)*(y2-y1);
		double val = val1 + val2;
		
		double dist = Math.pow(val, 0.5);
		System.out.println("The distance between the two points is "+dist);
		

	}

}

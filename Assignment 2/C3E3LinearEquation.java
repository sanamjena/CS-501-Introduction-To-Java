import java.util.*;
public class C3E3LinearEquation {

	public static void main(String[] args) {
		double a,b,c,d,e,f,x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("In this program we will solve a 2x2 linear equation using Cramer's rule");
		System.out.println("Considering ax + by = c is a standard linear equation, where a,b&c are the coefficients of the first equation and d,e&f are the coefficients of the second equation");
		System.out.print("Enter the values of a, b, c, d, e, f in a single line separated by spaces: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
		
		sc.close();
		
		x = ((e*d)-(b*f))/((a*d)-(b*c));
		y = ((a*f)-(e*c))/((a*d)-(b*c));
		
		if((a*d)-(b*c) == 0) {
			System.out.println("The equation has no solution");
		}
		
		if((a*d)-(b*c) != 0) {
			System.out.println("x is "+x+" and y is "+y);
		}
		
	}

}

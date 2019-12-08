import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int check =1;
		double a,b,c,d,e,f;
		while(check == 1) {
			System.out.println("In this program, we will be solving Linear Equation");
			System.out.println("The format of the Linear equation is ax + by = e & cx + dy = f");
			System.out.println("In this program you need to enter the value then press enter");
			System.out.println("Enter the value of a: ");
			a = sc.nextDouble();
			System.out.println("Enter the value of b: ");
			b = sc.nextDouble();
			System.out.println("Enter the value of c: ");
			c = sc.nextDouble();
			System.out.println("Enter the value of d: ");
			d = sc.nextDouble();
			System.out.println("Enter the value of e: ");
			e = sc.nextDouble();
			System.out.println("Enter the value of f: ");
			f = sc.nextDouble();
			
			try {
				LinearEquation l1 = new LinearEquation(a,b,c,d,e,f);
				if (l1.isSolvable()) {
					
					System.out.println("X is " + l1.getX());
					System.out.println("Y is " + l1.getY());
				} else if ((a == 0 && b == 0) || (c == 0 && d == 0)) {
					System.out.println("Error. You enter the same endpoint for one line.");
				}
				else if ((a * d == b * c) && (b * f == d * e)) {
					System.out.println("The two lines are coincidence lines.");
				}
				else {
					System.out.println("The two lines are parallel lines.");
				}
			} catch (Exception error) {
				System.out.println(error);
			}
			
			System.out.println("Press 1 to run the program again or else press any other number.");
			check = sc.nextInt();
			
		}
		sc.close();

	}

}

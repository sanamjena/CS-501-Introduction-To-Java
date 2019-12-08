import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int check = 1;
		double width,height;
		while (check ==1) {
				try {
					System.out.println("In this program, we will calculate the area and perimeter of a rectangle");
					System.out.println("Enter the Height and Width of the rectangle: ");
					height = sc.nextDouble();
					width = sc.nextDouble();
					System.out.println("You have entered the height as: "+height+" and the width as: "+width);
					
					Rectangle r = new Rectangle(height,width);
					
					System.out.println("The area of the Rectangle is: "+r.getArea());
					System.out.println("The perimeter of the Rectangle is: "+r.getPerimeter());
					System.out.println("Press 1 to run the program again or else press 0");
					check = sc.nextInt();
					
				} catch (IllegalArgumentException e) {
					System.out.println("The length and Breadth must be possitive");
				}
		}
		
		double w1 = 4, h1 = 40;
		Rectangle r1 = new Rectangle(h1,w1);
		double w2 = 3.5, h2 = 35.9;
		Rectangle r2 = new Rectangle(h2,w2);
		System.out.println("\n*****DEFAULT TEST CASES*****");
		System.out.println("The width of first rectangle is "+w1+" & the height is "+h1+" .");
		System.out.println("The perimeter of first rectangle is "+r1.getPerimeter());
		System.out.println("The area of the first rectangle is "+r1.getArea());
		System.out.println("The width of second rectangle is "+w2+" & the height is "+h2+" .");
		System.out.println("The perimeter of second rectangle is "+r2.getPerimeter());
		System.out.println("The area of the second rectangle is "+r2.getArea());
		sc.close();

	
	}

}

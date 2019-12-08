import java.util.*;

public class TestTriangle {

	public static void main(String[] args) {
		int flag = 1;
		System.out.println("This program will ask for 3 sides of a triangle, a color," +
		" and a filled attribute and will return a triangle and list some traits.");

		Scanner sc = new Scanner(System.in);

		while(flag == 1){
			List<Double> sides = new ArrayList<>();
			while (sides.size() != 3) {
				System.out.println("Please enter a side of the triangle.");
				String side = sc.nextLine();
				while (side.trim().length() == 0) {
						System.out.println("Please enter a valid number.");
						side = sc.nextLine();
				}
				try {
					double sideDouble = Double.parseDouble(side);
					sides.add(sideDouble);
				} catch (Exception e) {
					System.out.println("That is not a valid number.");
				}
			}

			try {
				Triangle triangle = new Triangle(sides.get(0), sides.get(1), sides.get(2));
				System.out.println("Please enter a color.");
				String color = sc.nextLine();
				while (color.trim().length() == 0) {
						System.out.println("Please enter something.");
						color = sc.nextLine();
				}

				System.out.println("Is the triangle filled? Please enter yes or no");
				String filled = sc.nextLine();
				while (filled.trim().length() == 0 || (!filled.trim().equals("yes") && !filled.trim().equals("no"))) {
						System.out.println("Please enter yes or no.");
						filled = sc.nextLine();
				}

				boolean filledBoolean = false;
				if (filled.equals("yes")) {
					filledBoolean = true;
				}

				String filledText = filledBoolean ? "filled" : "not filled";
				System.out.println("Your triangle is " + color + " and it is " + filledText + ". The area is " + triangle.getArea() + " and its perimeter is " + triangle.getPerimeter());

			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("Press 1 to run the entire program again or else press 0 to Exit");
			flag = sc.nextInt();
		}
		if(flag == 0) {
        	System.out.println("Program got terminated successfully upon your choice.");
        } else {
        	System.out.println("Program got terminated Unsuccessfully with some error.");
        }
		sc.close();
	}
}
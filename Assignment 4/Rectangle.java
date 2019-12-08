
public class Rectangle {
	double height= 1,width = 1;
	public Rectangle() {
		
	}
	public Rectangle (double hei, double wei)throws IllegalArgumentException {
		if(hei <= 0 || wei <= 0) {
			throw new IllegalArgumentException("The length & breadth must be greater than zero.");
		}
		
		height = hei;
		width = wei;
	}
	
	public double getArea() {
		return height*width;
	}
	
	public double getPerimeter() {
		return 2*(height+width);
	}
}

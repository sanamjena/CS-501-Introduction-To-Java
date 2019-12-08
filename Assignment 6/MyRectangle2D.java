
public class MyRectangle2D {
	private double x, y, width, height;
    public MyRectangle2D() throws Exception {
        this(0,0,1,1);
    }
    MyRectangle2D(double x, double y, double width, double height) throws Exception{
    	setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
	}
    public void setX(double x) {
		this.x = x;
	}
    public double getX() {
		return x;
	}
    
    public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
    }
	
	public void setWidth(double width) throws Exception{
        if(!isValid(width)){
            throw new Exception("Please provide a valid input where width is greater than 0");
        }
		this.width = width;
	}
	
	public double getWidth() {
		return width;
    }

	public void setHeight(double height) throws Exception{
        if(!isValid(height)){
            throw new Exception("Please provide a valid input where height is greater than 0");
        }
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	private boolean isValid(double value){
        if(value <= 0){
            return false;
        }
        return true;
    }
	
	public double getArea() {
		return width * height;
    }
    
	public double getPerimeter() {
		return 2 * (width + height);
    }
	
	private double getDistance(double p1, double p2) { //gets the distance
		return Math.sqrt(Math.pow(p2 - p1, 2));
	}
    
	public boolean contains(double x, double y) {      //if specified points are inside rectangle
		return getDistance(this.y, y) <= height / 2 && getDistance(this.x, x) <= width / 2; 
	}

	public boolean contains(MyRectangle2D r) {  //test whether provided rectangle is inside this rectangle
		return getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&  getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
			height / 2 + r.getHeight() / 2 <= height &&
		 	width / 2 + r.getWidth() / 2 <= width;
	}

	public boolean overlaps(MyRectangle2D r) {  //test if rectangles overlap
		return !contains(r) &&
				 ((x + width / 2 > r.getX() - r.getWidth()) ||
				 (y + height / 2 > r.getY() - r.getHeight())) &&
		  		 (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) && 
				 (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }
    
    public boolean abutment(MyRectangle2D r) {
        boolean right = (x + width/2) == (r.getX() - r.getWidth() / 2);
        boolean left = (r.getX() + r.getWidth() /2) == (x - width / 2);
        boolean top = (y + height / 2) == (r.getY() - r.getHeight() / 2);
        boolean bottom = (r.getY() + r.getHeight() / 2) == (y - height / 2);

        return left || right || top || bottom;
    }

    public boolean distinction(MyRectangle2D r){
        return !overlaps(r) && !abutment(r);
    }

 }

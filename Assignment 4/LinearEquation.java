
public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a1, double b1, double c1, double d1, double e1, double f1) {
		a = a1;
		b = b1;
		c = c1; 
		d = d1;
		e = e1;
		f = f1; 
	}
	
	double getA() {
		return a;
	}

	double getB() {
		return b;
	}

	double getC() {
		return c;
	}

	double getD() {
		return d;
	}
	
	double getE() {
		return e;
	}
	
	double getF() {
		return f;
	}
	
	boolean isSolvable() {
		if (a * d - b * c != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	double getX() {
		double x = (e * d - b * f) / (a * d - b * c);
		return x; 
	}

	double getY() {
		double y = (a * f - e * c) / (a * d - b * c);
		return y;
	}
		
}

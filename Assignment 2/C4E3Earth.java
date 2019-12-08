
public class C4E3Earth {
	public static final double r = 6371.01;

	public static void main(String[] args) {
		double atlX,atlY, orlX, orlY, savX, savY, chaX, chaY;
		System.out.println("Using the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina,");
		System.out.println("we will compute the estimated area enclosed by these four cities");
		
		//GPS COORDINATES OF THE CITIES HAVE BEEN USED FROM GOOGLE MAPS
		
		atlX = 33.7489954;  //POINT A
		atlY = -84.3879824;
		
		orlX = 28.5383355;	//POINT B
		orlY = -81.3792364999;
		
		savX = 32.0835407;	//POINT C
		savY = -81.09983419999998;
		
		chaX = 35.2270869;	//POINT D
		chaY = -80.84312669999997;
		
		System.out.println("The coordinates of Atlanta used are "+atlX+" & "+atlY);
		System.out.println("The coordinates of Orlando used are "+orlX+" & "+orlY);
		System.out.println("The coordinates of Savannah used are "+savX+" & "+savY);
		System.out.println("The coordinates of Charlotte used are "+chaX+" & "+chaY);
		
		double t1Side1 = distanceBetweenTwoPointsGEOGRAPH(atlX, atlY, savX, savY);
	    double t1Side2 = distanceBetweenTwoPointsGEOGRAPH(savX, savY, chaX, chaY);
	    double t1Side3 = distanceBetweenTwoPointsGEOGRAPH(chaX, chaY, atlX, atlY);

	    double t2Side1 = distanceBetweenTwoPointsGEOGRAPH(atlX, atlY, orlX, orlY);
	    double t2Side2 = distanceBetweenTwoPointsGEOGRAPH(orlX, orlY, savX, savY);
	    double t2Side3 = distanceBetweenTwoPointsGEOGRAPH(savX, savY, atlX, atlY);

	    
        double area1 = Area(t1Side1, t1Side2, t1Side3);
        double area2 = Area(t2Side1, t2Side2, t2Side3);
        System.out.printf("Sides and area of Triangle 1: %f | %f | %f  & area = %f\n", t1Side1, t1Side2, t1Side3, area1);
        System.out.printf("Sides and area of Triangle 2: %f | %f | %f  & area = %f\n", t2Side1, t2Side2, t2Side3, area2);
        double totalArea = area1 + area2;
        System.out.println("The area enclosed by the four cities is " + totalArea);
        
		
	}
	
	public static double Area(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
	
	public static double distanceBetweenTwoPointsGEOGRAPH(double x1, double y1, double x2, double y2) {

        double distance = r *
                Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

        return distance;
    }

}

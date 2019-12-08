import java.util.*;
 public class TestMyRectangle2D {
	    public static void main(String[] args) {
    	int flag = 1;
        System.out.println("This program takes input of the base rectange and then asks for the center coordinate & height & width of the second rectangle to test for different parameters");
        Scanner sc = new Scanner(System.in);
        while(flag == 1){
        	int flag1 = 1;
            while(flag1 == 1){
                System.out.println("Please enter x1 for the center of the BASE rectangle: ");
                String x1 = sc.nextLine();
                while (x1.trim().length() == 0) {
                    System.out.println("Please enter x1 for the center of the BASE rectangle as you did not in the previous prompt: ");
                    x1 = sc.nextLine();
                }
                System.out.println("Please enter y1 for the center of the BASE rectangle: ");
                String y1 = sc.nextLine();
                while (y1.trim().length() == 0) {
                    System.out.println("Please enter y1 for the center of the BASE rectangle as you did not in the previous prompt: ");
                    y1 = sc.nextLine();
                }
                System.out.println("Please enter width for the BASE rectangle: ");
                String width1 = sc.nextLine();
                while (width1.trim().length() == 0) {
                    System.out.println("Please enter width for the BASE rectangle as you did not in the previous prompt: ");
                    width1 = sc.nextLine();
                }
                System.out.println("Please enter height for the BASE rectangle: ");
                String height1 = sc.nextLine();
                while (height1.trim().length() == 0) {
                    System.out.println("Please enter height for the BASE rectangle as you did not in the previous prompt: ");
                    height1 = sc.nextLine();
                }

                try {
                    MyRectangle2D baseRectangle = new MyRectangle2D(Double.parseDouble(x1), Double.parseDouble(y1), Double.parseDouble(width1), Double.parseDouble(height1));
                    System.out.println("Area of BASE Rectangle:  " + baseRectangle.getArea()); 
                    System.out.println("Perimeter of BASE Rectangle: " + baseRectangle.getPerimeter());
                    int flag2 = 1;
                    while(flag2 == 1){
                        System.out.println("Please enter x2 for the center of the TEST rectangle: ");
                        String x2 = sc.nextLine();
                        while (x2.trim().length() == 0) {
                            System.out.println("Please enter x2 for the center of the TEST rectangle as you did not in the previous prompt:");
                            x2 = sc.nextLine();
                        }
                        System.out.println("Please enter y2 for the center of the TEST rectangle: ");
                        String y2 = sc.nextLine();
                        while (y2.trim().length() == 0) {
                            System.out.println("Please enter y2 for the center of the TEST rectangle as you did not in the previous prompt: ");
                            y2 = sc.nextLine();
                        }
                        System.out.println("Please enter width for the TEST rectangle: ");
                        String width2 = sc.nextLine();
                        while (width2.trim().length() == 0) {
                            System.out.println("Please enter width for the TEST rectangle as you did not in the previous prompt: ");
                            width2 = sc.nextLine();
                        }
                        System.out.println("Please enter height for the TEST rectangle: ");
                        String height2 = sc.nextLine();
                        while (height2.trim().length() == 0) {
                            System.out.println("Please enter height for the TEST rectangle as you did not in the previous prompt: ");
                            height2 = sc.nextLine();
                        }
                        try {
                            MyRectangle2D testRectangle = new MyRectangle2D(Double.parseDouble(x2), Double.parseDouble(y2), Double.parseDouble(width2), Double.parseDouble(height2));
                            System.out.println("Area of TEST Rectangle: " + testRectangle.getArea());
                            System.out.println("Perimeter of TEST Rectangle: " + testRectangle.getPerimeter());         
                            System.out.println("Points (" + x2 + "," + y2 + ") from TEST rectangle " + (baseRectangle.contains(Double.parseDouble(x2), Double.parseDouble(y2)) ? "ARE": "ARE NOT")  + " contained in BASE rectangle" );
                            System.out.println("BASE rectangle " + (baseRectangle.contains(testRectangle)? "DOES" : "DOES NOT") + " contain TEST rectangle with points ("  + x2 + "," + y2 + "," + width2 + "," + height2 + ")");
                            //System.out.println("TEST rectangle with points (" +  x2 + "," + y2 + "," + width2 + "," + height2 + ") " + (baseRectangle.overlaps(testRectangle) ? "OVERLAPS" : "DOES NOT OVERLAP") + " with BASE rectangle");
                            System.out.println("TEST rectangle with points (" +  x2 + "," + y2 + "," + width2 + "," + height2 + ") " + (baseRectangle.abutment(testRectangle) ? "HAS ABUTMENT" : "DOES NOT HAVE ABUTMENT") + " with BASE rectangle");
                            System.out.println("TEST rectangle with points (" +  x2 + "," + y2 + "," + width2 + "," + height2 + ") " + (baseRectangle.distinction(testRectangle) ? "IS DISTINCT" : "IS NOT DISTINCT") + " from BASE rectangle");
                            if (baseRectangle.contains(testRectangle)){
                            	System.out.println("TEST rectangle with points (" +  x2 + "," + y2 + "," + width2 + "," + height2 + ") Overlaps with BASE rectangle");
                            } else if (baseRectangle.overlaps(testRectangle)){
                            	System.out.println("TEST rectangle with points (" +  x2 + "," + y2 + "," + width2 + "," + height2 + ") Overlaps with BASE rectangle");
                            } else {
                            	System.out.println("TEST rectangle with points (" +  x2 + "," + y2 + "," + width2 + "," + height2 + ") Does NOT Overlap with BASE rectangle");
                            }
                            
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        
                        System.out.println("Press 1 to enter a new test triangle or else press 0");
                        flag2 = sc.nextInt();
                          
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("Press 1 to enter a new Base Rectangle or else press 0");
				flag1 = sc.nextInt();

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
import java.util.*;

public class C9E5Gregorian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GregorianCalendar newcal = new GregorianCalendar();
		int check =1;
		while(check == 1) {
			System.out.println("In this program, we are going to use the Gregorian Calendar clss to display the current year, month & date");
			System.out.println("We are also going to display the specified time elapsed since January 1, 1970 & display the year, month & day");
			System.out.println("Current date in DD/MM/YYYY format is: "+newcal.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(newcal.get(GregorianCalendar.MONTH)+1)+"/"+newcal.get(GregorianCalendar.YEAR));

			newcal.setTimeInMillis(1234567898765L);

			System.out.println("The set date in DD/MM/YYYY format is: " +newcal.get(GregorianCalendar.DAY_OF_MONTH)+ "/" +(newcal.get(GregorianCalendar.MONTH)+1)+ "/" + newcal.get(GregorianCalendar.YEAR));
			System.out.println("To run the program again press 1 or else press any other number");
			check = sc.nextInt();
		}
		sc.close();
		
	}

}

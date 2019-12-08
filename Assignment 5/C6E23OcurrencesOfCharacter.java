import java.util.*;
public class C6E23OcurrencesOfCharacter {

	public static void main(String[] args) {
		int flag = 1;
		
		System.out.println("This program takes input of string containng atleast 3 chracters and then the character to print the number of occurence of the same");
        Scanner sc = new Scanner(System.in);
        
        while(flag == 1) {
        	System.out.print("Please enter a string at least 3 characters in length that includes only letters and numbers: ");
        	String input = sc.next();
        	
        	System.out.println("String entered is: "+input);
        	int flag1 = 1;
        	try {
        		isValidString(input);
        		while(flag1 == 1) {
            		System.out.println("Please enter a character to count it's occurence: ");
            		String test1 = sc.next();
            		if (test1.length() > 1) {
            			throw new Exception("You have entered more than 1 character to search. Enter exactly 1 chracter");
            		}
            		char test = test1.charAt(0);
            		
            		System.out.println("The number of times '" + test + "' is found is: " + count(input, test));
            		System.out.println("Press 1 to count the occurence for another character or else press 0 to enter another string");
                    flag1 = sc.nextInt();
            	}
        	} catch (Exception e){
        		System.out.println(e);
        	}
        	System.out.println("Press 1 to repeat the program or else press 0");
            flag = sc.nextInt();
        }
        if(flag == 0) {
        	System.out.println("Program got terminated successfully upon your choice.");
        } else {
        	System.out.println("Program got terminated Unsuccessfully with some error.");
        }
        sc.close();

	}

	private static int count(String input, char test) throws Exception{
		int counter = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == test){
                counter++;
            }
        }
        return counter;
	}

	private static void isValidString(String input) throws Exception{
		for(int i = 0; i < input.length(); i++){
            if(Character.isLetterOrDigit(input.charAt(i)) == false){
                throw new Exception("String provided can only include numbers and letters");
            }
        }
		
	}

}

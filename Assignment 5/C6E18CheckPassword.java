import java.util.*;

public class C6E18CheckPassword {

	public static void main(String[] args) {
		int flag = 1;
		System.out.println("This program takes input of password & checks if it is valid or not");
        Scanner sc = new Scanner(System.in);
        String password;
        while (flag == 1) {
            System.out.print("\n\nPlease enter a new password that has at least 10 characters, consists of only letters and digits, and contains at least three digits: ");
            password = sc.next();
            
            System.out.println("Password Entered is: "+password);

            try {
                isPasswordValid(password);  
                System.out.println("Password is Valid!");
            } catch (Exception e) {
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

	private static void isPasswordValid(String password) throws Exception {
		if(!validLength(password)){
            throw new Exception("Password is not of the valid Length, Should be of atleast 10 Characters");
        }
		if (!onlyLettersAndDigits(password)){
            throw new Exception("Password should only contain Letters & Digits.");
        }
		if (!checkDigits(password)){
             throw new Exception("Password should contain atleast 3 digits");
        }
		
	}

	private static boolean checkDigits(String password) {
		int count = 0;
        for (int i = 0; i < password.length(); i++){  //loop through and get number of digits
            if(Character.isDigit(password.charAt(i))){
                count ++;
            }
        }
		return count >= 3;
	}

	private static boolean onlyLettersAndDigits(String password) {
		for(int i = 0; i < password.length(); i++){
            if(Character.isLetterOrDigit(password.charAt(i)) == false){
                return false;
            }
         }
         return true;
	}

	private static boolean validLength(String password) {
		
		return password.length() >= 10;
	}
}



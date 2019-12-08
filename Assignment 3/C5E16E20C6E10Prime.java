import java.util.*;
import java.math.*;
public class C5E16E20C6E10Prime {

	public static void main(String[] args) {
		int flag = 1;
		int ctr = 0, num = 2,found = 0;
		int arr[] = new int[1000],input;
		System.out.println("In this program we are going to \n ->print the first 50 prime numbers\n -> verify if a number entered is prime if no then print its prime factors  ");
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
		Scanner sc = new Scanner(System.in);
		while(flag == 1) {
			System.out.println("Enter number in between 2 & 1000");
			input = sc.nextInt();
			
			System.out.println("You have entered: "+input);
			for(int i = 1; i<1000; i++) {
				if(isPrime(i)) {
					arr[ctr] = i;
					ctr++;
				}
			}
			
			for(int j: arr) {
				if(input == j) {
					found = 1;
				}
			}
			
			if (found == 1) {
				System.out.println(input+" is a prime number");
			} else {
				System.out.println(input+" is not a prime number. The factors are: ");
				for(int k = 1; k<input;k++) {
					if (input%k==0) {
						System.out.print(" "+k);
					}
				}
			}
			
			System.out.println("\nTo use the program again press 1 else press 0");
			flag = sc.nextInt();
			
			
		}

	}
	//Listing 6.7
	public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIME_PER_LINE = 10; // Display 10 per line
        int count = 0; //Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {
        	// Print the prime number and increase the count
            if (isPrime(number)) {
                count++; // Increase the count
                if (count % NUMBER_OF_PRIME_PER_LINE == 0) {
                	// Print the number and advance to the new line
                    System.out.printf("%-5d\n", number);
                }
                else
                System.out.printf("%-5d", number);
            }
            // Check whether the next number is prime
            number++;
        }
    }
	
	//Listing 6.7
	public static boolean isPrime(int number) {
		 for (int divisor = 2; divisor <= Math.sqrt(number) ; divisor++) { //Implemented my logic to reduce the time complexity
			 if (number % divisor == 0) { // If true, number is not prime
				 return false; // Number is not a prime
			 }
		 }
		
		 return true; // Number is prime
	}
	

}

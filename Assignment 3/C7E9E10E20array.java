import java.util.*;
public class C7E9E10E20array {
	static double min;
	static int index,test1;

	public static void main(String[] args) {
		double[] arr = new double[10];
		double test;
		int flag = 1;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("In this Program,\n-> we will find the smallest present in the array\n->print the position of the smallest element\n->Sort the array & display it");
		while (flag == 1) {
			System.out.println("Enter and array of 10 Decimal numbers: ");

			for(i = 0;i<10;i++) {
				arr[i] = sc.nextDouble();
			}
			
			test = min(arr);
			test1 = indexOfSmallestElement(arr);
			
			System.out.println("The minimum number is: "+test);
			System.out.println("The smallest element is in position: "+test1);
			
			double[] arr1 = bubblesort(arr);
			System.out.println("The sorted array in desc. Order is: ");
			for(int k = 0; k<10;k++) {
				System.out.print(" "+arr1[k]);
			}
			
			System.out.println("\nIf you want to run the program again press 1 else press 0: ");
			flag = sc.nextInt();
			
		}
		
		
		

	}
	
	public static double min(double[] array) {
	    min = array[0];
	    int i;
	    for (i=1;i<10;i++) {
	        if (i < min) {
	            min = i;
	        	
	        }
	    }
	    return min;
	}
	
	public static int indexOfSmallestElement(double[] array) {
		int i;
		for (i = 0; i<10; i++) {
			if (array[i]== min) {
				index = i;
			}
		}
		
		return index;
	}
	
	public static double[] bubblesort(double[] array) {
		double[] array1 = array;
		int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] < array[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    double temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
        return array1;
	}

}

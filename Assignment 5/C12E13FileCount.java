import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class C12E13FileCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("This program lets the user to choose a file in order to know the following details: \n1. No of Lines\n2. No of Words\n3. No of Characters\n");
		int flag = 1;
        
        while (flag == 1) {
    		
    		int Lines = 0;
            int Characters = 0;
            int Words = 0;
        	JFileChooser File = new JFileChooser();
        	File.setDialogTitle("Please Choose a text file with .txt extension");
        	File.setFileFilter(new FileNameExtensionFilter("Open TEXT file", "txt"));
        	int check = File.showOpenDialog(null);
            if(check == JFileChooser.APPROVE_OPTION){ 
                try {
                System.out.println("You selected the file: " + File.getSelectedFile().getName());
                FileReader fr = new FileReader(File.getSelectedFile());
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br);
                String nameOfFile = File.getSelectedFile().getName();
                for(int numLine = 1; s.hasNext(); numLine++){
                    String Line = s.nextLine();
                    Lines++;
                    Characters = Characters + Line.length();
                    String[] splitter = Line.split("\\s+");
                    Words = Words + splitter.length; 
                }

                s.close();
                System.out.println("The details of the file "+nameOfFile + " are: ");
                System.out.println("1. No of Lines: "+Lines);
                System.out.println("2. No of Words: "+Words);
                System.out.println("3. No of Characters: "+Characters);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            if(check != JFileChooser.APPROVE_OPTION) {
            	System.out.println("You have not selected any file to read and clicked cancel");
            }
            System.out.println("Press 1 to repeat the program or else press 0");
            flag = sc.nextInt();
        }
        sc.close();
        if(flag == 0) {
        	System.out.println("Program got terminated successfully upon your choice.");
        } else {
        	System.out.println("Program got terminated Unsuccessfully with some error.");
        }
        
	}

}

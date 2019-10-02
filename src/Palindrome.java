import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Palindrome {

	
	/**
	 * A Method that compare the First String characters with the second string and see if it match
	 * and return  true else return false.
	 * @param str1
	 * @param str2
	 * @param m
	 * @param n
	 * @return
	 */
	public boolean isSubSequence(String str1, String str2, int m, int n) {
			
		int j = 0; 
	
		for (int i = 0; i < n && j < m; i++) 
            if (str1.charAt(j) == str2.charAt(i)) 
                j++; 
				
		return(j == m);
		
		}// end of isSubSequence
	/*
	public void test() {
		
		
		String s = "adc";
		String s2 = "aqdec";
		int m = s.length();
		int n = s2.length();
		boolean r = isSubSequence(s, s2, m , n);
		if(r) {
			
			System.out.println(s + " IS A SUBSEQUENCE of " + s2);
			
		}
		else {
			
			System.out.println( s +" IS NOT A SUBSEQUENCE of "+ s2);
			
		}
	}
	/*
	/**
	 * A method that gets an input of two different string from the user
	 * and check if the first string is a subsequence of the second string.
	 */
	public void manual() {
		
		Scanner scan = new Scanner (System.in);
		String userInput = "";
		String userInputTwo = "";
		int m = userInput.length();
		int n = userInputTwo.length();
		
			
		System.out.println("Enter the first sequence:");
		
		userInput = scan.nextLine();
		
		System.out.println("Enter the second sequence:");
		
		userInputTwo = scan.nextLine();
		
		boolean r = isSubSequence(userInput, userInputTwo, m , n);
		if(r) {
			
			System.out.println(userInput + " IS A SUBSEQUENCE of " + userInputTwo);
			
		}
		else {
			
			System.out.println( userInput +" IS NOT A SUBSEQUENCE of "+ userInputTwo);
		}
		
		
	}// end of Strings
	
	/**
	 * Get input from the user
	 * Check if the string input from the user is a subsequence of the other string.
	 * 
	 */
	public void input() {
		
		String userInput;
		char op;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Would you like enter sequences manually or from a file? (M/F):" );
		op = scan.nextLine().charAt(0);
	
		 if(op == 'M') {
			
			 manual();

		}// end of
		 else if (op == 'F') {
			 
			 System.out.println("Enter the name of the file to process:");
			 
			 userInput = scan.nextLine();
			 if(userInput == "sequences.txt") {
				 readFile();
			 }
			 
			 System.out.println("<END RUN>");
			 System.exit(0);
		 }
		
		System.out.println();
		System.out.println("Would you like to enter more sequences? (Y/N):" );
		
		op = scan.nextLine().charAt(0);
		
		if(op == 'Y') {
			
			manual();
		
		}// end of if 2
		if (op == 'N') {
			
			System.out.println("<END RUN>");
			System.exit(0);
			
		}// end of  if 
			
		System.out.println("Would you like to enter more sequences? (Y/N):" );
		
		op = scan.nextLine().charAt(0);
		
		if(op == 'Y') {
			
			manual();
			
			//System.out.println();
			//System.out.println("<END RUN>");
		
		}// end of if 2
		if (op == 'N') {
			
			System.out.println("<END RUN>");
			System.exit(0);
		}// end of  if 
		scan.close();
	}// end of input
	
	
	public void Stack() {
	

	}// end of Stack
	
	/**
	 * A method reading a file using Scanner.
	 */
	public void readFile() {
		
		BufferedReader reader = null;
		
		try {
			File file = new File("file.txt");
			reader = new BufferedReader(new FileReader(file));
			
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				
				
			}// end of while
			
		}// end of try
		catch(IOException e) {
			e.printStackTrace();
		}// end of catch
		finally {
			try {
				reader.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		/*
		try {
			
			File file = new File("file.txt");
			Scanner scan;
			scan = new Scanner(file);
			
			while(scan.hasNextLine());{
				String i = scan.nextLine();
				System.out.println("" + i);
			}
				scan.close();
		}// end of try
		
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}// end of catch
		*/
	}// end of readFile
}// end of class

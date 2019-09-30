import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.util.*;

public class Palindrome {

	private Scanner x;
	
	/**
	 * A Method that compare the First String characters with the second string and see if it match
	 * and return  if all the characters are found
	 * @param str1
	 * @param str2
	 * @param m
	 * @param n
	 * @return
	 */
	static boolean isSubSequence(String str1, String str2, int m, int n) {
			
		int j = 0; 
	
		for (int i = 0; i < n && j < m; i++) 
				if (str1.charAt(j) == str2.charAt(i)) 
						j++; 
		
			return (j == m);  
		}// end of isSubSequence
	
	public void test() {
		
		
		String s = "abc";
		String s2 = "abc";
		int l1 = s.length();
		int l2 = s2.length();
		
		boolean r = isSubSequence(s, s2, l1, l2);
		if(r) {
			
			System.out.println(s + " IS A SUBSEQUENCE of " + s2);
			
		}
		else {
			
			System.out.println( s +" IS NOT A SUBSEQUENCE of "+ s2);
			
		}
	}
	
	public void Strings() {
		
		Scanner scan = new Scanner (System.in);
				
		System.out.println("Enter the first sequence:" );
		scan.nextLine();
		
		System.out.println("Enter the second sequence:");
		scan.nextLine();
		scan.close();
	}// end of Strings
	
	/**
	 * Get input from the user
	 * 
	 */
	public void input() {
		
		
		Scanner scan = new Scanner (System.in);
		String userInput = scan.nextLine();
		
		System.out.println("Would you like enter sequences manually or from a file? (M/F):" );
		scan.nextLine();
		/*
		if( userInput.equals("F")) {
			
			readFile();
			closeFile();
		}// end of if 1
		*/
		if(userInput.equals("M")) {
			
			Strings();

		}// end of else if
		
		if(userInput.equals("Y")) {
			
			Strings();
		}// end of if 2
		else if (userInput.equals("N")) {
			scan.close();
		}
		System.out.println("Would you like to enter more sequences? (Y/N):" );
		scan.nextLine();
		
		
		System.out.println("Would you like to enter more sequences? (Y/N):" );
		scan.nextLine();	
		
	}// end of input
	
	public void openFile() {
		
		try {
			
			x = new Scanner (new File("file.txt"));
		}// end of try
		catch( Exception e) {
			
			System.out.println("No File Found");
			
		}// end of catch
		
		
	}// end of openFile
	
	public void readFile() {
		
		while(x.hasNext()) {
			
			String a = x.next();
			String b = x.next();
			String c = x.next();
			String d = x.next();
			
			System.out.printf("%s %s %s %s", a, b, c , d);
			
		}// end of while
	}// end of readFile
	
	public void closeFile() {
		
		x.close();
	}
	
}// end of class

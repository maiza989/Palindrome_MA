/**
 * a Java program to determine if one string is a subsequence of another.
 * @Author: Maitham Al-Ghamgham
 * @version 1.0  /  10/03/2019
 * programming project 2
 * Fall/2019
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Palindrome {

	
	/**
	 * Create Two Stacks 
	 * two for loop to push characters
	 * a for loop to pop characters from stack one 
	 * for loop to check if the character is equal to what about to pop if so return true
	 * A Method that compare the First String characters with the second string and see if it match
	 * and return  true else return false.
	 * @param str1
	 * @param str2
	 * @param m
	 * @param n
	 * @return
	 */
	public boolean isSubSequence(String str1, String str2, int m, int n) {
		
		Stack<Character> seqOne = new Stack<>();
		Stack<Character> seqTwo = new Stack<>();
	
		String in1 =""; 
		String in2 = "";
		
		for(int i = 0; i < in2.length(); i++) {
			char c = in2.charAt(i);
			seqOne.push(c);
		}
		for(int j = 0; j < in1.length(); j++) {
			char a = in1.charAt(j);
			seqTwo.push(a);
		}
		
		for(int f = 0; f < seqOne.size(); f++) {
			char j = seqOne.pop();
			for(int s = 0; s < seqTwo.size(); s++) {
				if ( j == seqTwo.pop()) {
				return true;
				}
		
			}
		}
		int j = 0; 
		
		for (int i = 0; i < n && j < m; i++) 
            if (in1.charAt(j) == in2.charAt(i)) 
                j++; 
				
		return(j == m);
		
			
		
		/*
		Stack<Character> seqOne = new Stack<>();
		Stack<Character> seqTwo = new Stack<>();
		
		for(int i = 0; i <= str1.length(); i++) {
			seqOne.push(str1.charAt(i));
		} 
		
		for(int j = 0; j <= str2.length(); j++) {
			
			seqTwo.push(str2.charAt(j));
			
		}
		
		if(str1 != null && str2 != null & str1.length() <= str2.length() & str2.contains(str1));
		
		for(int l = 0; l < str1.length() && l < str2.length(); l++);
			if(seqOne.pop() == seqTwo.peek()) {
			return true;
			}
			else
				return false;
			*/
		/*
		int j = 0; 
		
		for (int i = 0; i < n && j < m; i++) 
            if (str1.charAt(j) == str2.charAt(i)) 
                j++; 
				
		return(j == m);
		*/
		}// end of isSubSequence
	
	/*
	 * test method
	 */
	/*
	public void test() {
		
		
		String s = "adc";
		String s2 = "adc";
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
	*/
	
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
		
		userInput = scan.nextLine();
		
		boolean r = isSubSequence(userInput, userInputTwo, m , n);
		if(r) {
			
			System.out.println(userInput + " IS A SUBSEQUENCE of " + userInputTwo);
			
		}
		else {
			
			System.out.println( userInput +" IS NOT A SUBSEQUENCE of "+ userInputTwo);
			
		}
		
	
	}// end of Strings
	
	/**
	 * Get input from the user manually or from a file
	 * if manually the user input two strings
	 * if file it will read the strings and determine if one is substring to the other.
	 * Check if the string input from the user is a subsequence of the other string.
	 * 
	 */
	public void input() {
		
		String userInput = "";
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
			 
			//while(userInput == "sequences.txt") {
				 readFile();
			//}
			 
			 System.out.println();
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
		
		System.out.println();
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
		
	}// end of input
	
	/**
	 * A method reading a file using BufferedReader.
	 * And a StringTokenizer to split the sequences.
	 */
	public void readFile() {
		
		BufferedReader reader = null;
		
		try {
			
			File file = new File("sequences.txt");
			reader = new BufferedReader(new FileReader(file));
			
			String line = "";
			
			while((line = reader.readLine()) != null) {
			
				String[] sequenceInfo = line.split(",");
				
				String str1 = sequenceInfo[0];
				String str2 = sequenceInfo[1];
				int m = str1.length();
				int n = str2.length();
				
				boolean r = isSubSequence(str1, str2, m , n);
				if(r) {
					
					System.out.println(str1 + " IS A SUBSEQUENCE of " + str2);
					
				}
				else {
					
					System.out.println(str1 +" IS NOT A SUBSEQUENCE of "+ str2);
				}
			
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
				System.out.println(i);
			}
				scan.close();
		}// end of try
		
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}// end of catch
		*/
	}// end of readFile
}// end of class

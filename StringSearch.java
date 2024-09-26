// Java Program to Implement the String Search 
// Algorithm for Short Text Sizes 

import java.io.*; 

class StringSearch { 
	public static void main(String[] args) 
	{ 

		String text = "geeksforgeeks is a coding website for geeks"; 
		String pattern = "geeks"; 

		// calling the method that is designed for 
		// printing the instances of pattern 
		// found in the text string 
		stringMatch(text, pattern); 
	} 
	public static void stringMatch(String text, String pattern) 
	{ 

		int len_t = text.length(); 
		int len_p = pattern.length(); 

		int k = 0, i = 0, j = 0; 

		// loop to find out the position Of searched pattern 
		for (i = 0; i <= (len_t - len_p); i++) { 

			for (j = 0; j < len_p; j++) 
			{ 
				if (text.charAt(i + j) != pattern.charAt(j)) 
					break; 
			} 
			
			if (j == len_p) 
			{ 
				k++; 
				System.out.println("Pattern Found at Position: " + i); 
			} 
		} 
		
		if (k == 0) 
			System.out.println("No Match Found!"); 
		else
			System.out.println("Total Instances Found = " + k); 
	} 
}

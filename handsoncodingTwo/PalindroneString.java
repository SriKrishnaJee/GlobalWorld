package handsoncodingTwo;
import java.util.*;

public class PalindroneString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original, reverse = ""; // Objects of String class  
	      Scanner ob = new Scanner(System.in);   
	      System.out.println("Enter a string to check if it is a palindrome");  
	      original = ob.nextLine(); 
	     // ob=ob.toLowerCase();
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equalsIgnoreCase(reverse))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome.");   
	}

}

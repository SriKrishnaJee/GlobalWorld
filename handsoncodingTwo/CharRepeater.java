package handsoncodingTwo;
import java.util.*;

public class CharRepeater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "Love";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		int n = str.length();
		
		String repeater = "";
		
		if (n < 2) repeater = str;
		else repeater = str.substring(0, 2);
		
		String output = "";
		
		for (int i = 0; i < n; i++) {
			output += repeater;
		}
		
		System.out.println(output);
	}

}

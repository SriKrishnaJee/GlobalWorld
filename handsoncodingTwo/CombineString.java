package handsoncodingTwo;
import java.util.Scanner;

public class CombineString {
	/*public String comboString(String a,String b) {
		int len = a.length();
		int len2 = b.length();
		if(len<len2)
			return a+b+a;
		else
			return b+a+b;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter first string: ");
	        String a = scanner.next();
	        System.out.println("Enter second string: ");
	        String b = scanner.next();
	        
	        if(a.length() > b.length())
	        System.out.println(b+a+b);
	        else
	        System.out.println(a+b+a);
	}

}

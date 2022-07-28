package handsoncodingTwo;
import java.util.Scanner;

public class MergeAlternatively {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1=sc.nextLine();
		System.out.println("Enter second String: ");
		String s2=sc.nextLine();
		int i=0, j = 0;
		while(i<s1.length()||j<s2.length()) {
			if(i<s1.length()) {
				System.out.print(s1.charAt(i));
				i++;
			}
			if(j<s2.length()) {
				System.out.print(s2.charAt(j));
				j++;
			}
		}
	}

}

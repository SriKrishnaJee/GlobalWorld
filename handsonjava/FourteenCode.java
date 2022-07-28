package handsonjava;

import java.util.Scanner;

public class FourteenCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int l=s.nextInt();
		for(int i=0;i<l;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}

package handsonjava;

import java.util.Scanner;

public class EleventhCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int count = 0;
		for(int i=2;i<n/2;i++) {
			if(n%i == 0) {
				count++;
			}
			else {
				continue;
			}
		}
		if(count == 0) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is Non prime");
		}
	}

}

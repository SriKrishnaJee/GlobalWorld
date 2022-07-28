package handsonjava;

import java.util.Scanner;

public class ThirteenCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		int sum;
		for(sum = 0;n>0;n=n/10) 
			sum=sum+(n%10);
			System.out.println(sum);
		
	}

}

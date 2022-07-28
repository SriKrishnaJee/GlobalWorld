package handsonjava;

import java.util.Scanner;

public class Firstone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number : ");
num = sc.nextInt();

if(num>0) {
	System.out.println("Positive number");
	
}else if(num<0) {
	System.out.println("Negative number");
}
else
	System.out.println("The number is Zero");
	}

}

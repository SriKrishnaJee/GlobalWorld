package handsonjava;

import java.util.Scanner;

public class FifteenCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number: ");
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int dig, rev = 0;
while(n>0) {
	dig = n%10;
	rev = rev*10+dig;
	n = n/10;
}
System.out.println(rev);
	}

}

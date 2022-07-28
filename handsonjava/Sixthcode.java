package handsonjava;

import java.util.Scanner;

public class Sixthcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
char c=sc.next().charAt(0);
int i;
if(c>='a'&&c<='z') {
	System.out.print(c+"-> ");
	i=(int)c;
	c=(char)(i-32);
	System.out.println(c);
}
else {
	System.out.print(c+"-> ");
	i=(int)c;
	c=(char)(i+32);
	System.out.println(c);
}
	}

}

package handsonjava;

import java.util.Scanner;

public class Fifthcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Gender");
String gen = sc.next();
System.out.println("Enter Age");
int age = sc.nextInt();
if(gen.equals("Female") && (age>=1 && age<=58)) {
	System.out.println("percentage of interest is 8.2%");
	
}
else if(gen.equals("Female") && (age>=59 && age<=100)) {
System.out.println("percentage of interest is 9.2%");
}
else if(gen.equals("Men") && (age>=1 && age<=58)) {
	System.out.println("percentage of interest is 8.4%");
}
else if(gen.equals("Men") && (age>=59 && age<=100)) {
	System.out.println("the percentage of interest is 10.5%");
}
	}

}

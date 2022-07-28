package handsonjava;

import java.util.Scanner;

public class Patient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Patient : ");
		String name=sc.nextLine();
	      System.out.println("Input weight in kilogram: ");
	      double weight = sc.nextDouble();
	      System.out.println("Input height in meters: ");
	      double height = sc.nextDouble();
	      double BMI = weight / (height * height);
	      System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
	}

}

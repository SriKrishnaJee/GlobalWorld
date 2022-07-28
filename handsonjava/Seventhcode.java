package handsonjava;
import java.util.Scanner;
public class Seventhcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter your colour code: ");
        char choice = in.next().charAt(0);
        switch (choice) {
            case 'R':
                System.out.println("RED");
                break;
                
            case 'B':
                System.out.println("Blue");
                break;
                
           case 'G':
                System.out.println("Green");
                break;
                
           case 'O':
                System.out.println("Orange");
                break;
                
           case 'Y':
               System.out.println("Yellow");
               break;
                
           case 'W':
                System.out.println("White");
                break;
                
           default:
                System.out.println("Invalid code");
        }
	}

}

package handsonjava;
import java.util.Scanner;


public class Fourthcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
char char1 =scanner.next().charAt(0);
if(char1>=48 && char1<=57)
{
    System.out.print("char is Digit");

}
else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
{
    System.out.print("char is Alphabet");
}
else
{
    System.out.print("char is special character");

	}

}}

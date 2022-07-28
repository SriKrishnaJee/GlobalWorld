package handsonjava;

public class seventeenCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, i=1;
			while(count<10 && i<=1000) {
			if (i%2==0 && i%3==0 && i%5==0) {
				System.out.print(i +", ");	
			count++;
			}
			i++;}
		System.out.println("\n");
	}

}

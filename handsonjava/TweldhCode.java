package handsonjava;

public class TweldhCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		for(int i=10;i<=99;i++) {
			n = 1;
			for(int j=2;j<=i/2;j++) {
				if(i%j == 0) {
					n=0;
					break;
				}
			}
			if(n == 1) {
				System.out.println(i+" ");
			}
		}
	}

}

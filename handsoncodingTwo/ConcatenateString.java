package handsoncodingTwo;

public class ConcatenateString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mark";
		String b="late";
		if(b.charAt(0)==a.charAt(a.length()-1)) {
			b=b.substring(1);
			String z=a+b;
			System.out.println(z.toLowerCase());
		}else {
			String c=a+" "+b;
			System.out.println(c.toLowerCase());
			
		}
	}
	 

}

package handsoncodingTwo;

public class StringHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "CatDog";
		
		String output;
		
		if (str.length() % 2 == 0) {
			output = str.substring(0, str.length() / 2);
		} else {
			output = null;
		}
		
		System.out.println(output);
	}

}

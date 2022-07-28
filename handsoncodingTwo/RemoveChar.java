package handsoncodingTwo;

public class RemoveChar {
	public static String removeFirstandLast(String str)
	{
		str=str.substring(1, str.length()-1);
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Suman";
		System.out.println(removeFirstandLast(str));
	}

}

package handsoncodingTwo;

import java.util.HashSet;
import java.util.Iterator;

public class HashEmployeeSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Asad");
		set.add("Omkar");
		set.add("Johny");
		set.add("Mannu");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
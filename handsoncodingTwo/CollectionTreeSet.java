package handsoncodingTwo;
import java.util.*;


public class CollectionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<String> set = new TreeSet<>();
		Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("ullu");
		set.add("tota");
		set.add("kabutar");
		set.add("baaz");
		
		Iterator<String> it = set.iterator();
		String query = "baaz";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}

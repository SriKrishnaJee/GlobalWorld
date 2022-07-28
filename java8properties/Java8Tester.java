package java8properties;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class Java8Tester {
	public static void eval(List<Integer> list,Predicate<Integer> pred) {
		for(Integer i : list) {
			if(pred.test(i)) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		  List<Integer> alist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


          System.out.println("Print all Numbers: ");
          eval(alist,(n)->true);

          System.out.println();
          System.out.println("Print even Numbers: ");
          eval(alist, (n)->n%2==0);


          System.out.println(); 
          System.out.println("Print numbers greater than 3:"); 
          eval(alist, (n)->n>3);
          // TODO Auto-generated method stub
		/* Predicate<Integer> noGreaterThan3 = x -> x > 3;
	        Predicate<Integer> noEven = x -> x%2==0;

	        ArrayList<Integer> list =new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(8);
	        list.add(9);

System.out.println(list);
	        List<Integer> collect = list.stream()
	                .filter(noGreaterThan3.and(noEven))
	                .collect(Collectors.toList());

	        System.out.println(collect);*/
	}

}

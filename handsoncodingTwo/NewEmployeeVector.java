package handsoncodingTwo;

import java.util.Iterator;
import java.util.Vector;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class NewEmployeeVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "rohit", "123 kolkata, India", 50000.0));
		list.add(new Employee(102, "nitish", "234 chennai, India", 45000.0));
		list.add(new Employee(103, "asad", "345 kochi, India", 39800.0));
		list.add(new Employee(104, "Aayush", "456 Bhubneswar, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
	}

}

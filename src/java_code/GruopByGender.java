package java_code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	String name;
	String gender;
	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
}
public class GruopByGender {

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1, "guru", "male"));
		emp.add(new Employee(2, "kathir", "male"));
		emp.add(new Employee(3, "kavi", "female"));
		emp.add(new Employee(4, "Lorri", "female"));
		emp.add(new Employee(5, "Jhon", "male"));
		
emp.stream().map(e->e.getGender()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}
}

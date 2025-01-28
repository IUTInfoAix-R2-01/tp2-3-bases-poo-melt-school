package yaip_poo;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
}

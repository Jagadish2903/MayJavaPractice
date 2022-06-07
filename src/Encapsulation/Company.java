package Encapsulation;

public class Company {

	private String name;
	private int year;
	private int salary;

	// always getter and setter should be public
	public void setName(String name) {
		this.name = name;
	}
	// here this.name defines the Class properties

	public String getName() {
		return name;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

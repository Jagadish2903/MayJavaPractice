package AccessModifiers;

public class Company {

	public void place() {
		System.out.println("public place");
	}

	private void name() {
		System.out.println("private name ");
	}

	protected void empCount() {
		System.out.println("protected emp count");
	}

	void avgSalary() {
		System.out.println("Average Salary");
	}
	


	public static void main(String[] args) {

		Company c=new Company();
		c.place();
		c.name();
		c.empCount();
		c.avgSalary();
		
	}

}

package AccessModifiers;

public class IBM {

	public static void main(String[] args) {
		Company c1=new Company();
		c1.place();
		//c1.name();//private not accessible
		c1.avgSalary();
		c1.empCount();
		

	}

}

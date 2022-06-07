package AccessMod;

import AccessModifiers.Company;

public class Trimax extends Company {

	public static void main(String[] args) {
		Company c3 = new Company();
		c3.place();
		// c2.name();//private not accessible
		// c2.empCount()//protected not accessible
		// c2.avgSalary()//default not accessible

	}

}

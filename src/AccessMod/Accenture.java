package AccessMod;

import AccessModifiers.Company;

public class Accenture {

	public static void main(String[] args) {
		Company c2=new Company();
		
		c2.place();
		//c2.name();//private not accessible
		//c2.empCount()//protected not accessible 
		//c2.avgSalary()//default not accessible

	}

}

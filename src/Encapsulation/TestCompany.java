package Encapsulation;

public class TestCompany {

	public static void main(String[] args) {

		
		Company obj =new Company ();
		obj.setName("IBM");
		obj.setSalary(1000);
		obj.setYear(2022);
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
		System.out.println(obj.getYear());
	}

}

package Encapsulation;

public class TestEmployeeReg {

	public static void main(String[] args) {
		
		Employee_Registration e1=new Employee_Registration();
		e1.setName("Sambath");
		e1.setAge(30);
		e1.setSalary(1200.34);
		e1.setIs_Active(true);
		e1.setGender('m');
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getIs_Active());
		System.out.println(e1.getGender());
		
		Employee_Registration e2=new Employee_Registration();
		e2.setName("Jana");
		e2.setAge(50);
		e2.setSalary(1234500.34);
		e2.setIs_Active(false);
		e2.setGender('F');
		
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.getSalary());
		System.out.println(e2.getIs_Active());
		System.out.println(e2.getGender());
		
		
		Employee_Registration e3=new Employee_Registration();
		e3.setName("Vinoth");
		e3.setAge(20);
		e3.setSalary(121200.34);
		e3.setIs_Active(true);
		e3.setGender('M');
		
		System.out.println(e3.getName());
		System.out.println(e3.getAge());
		System.out.println(e3.getSalary());
		System.out.println(e3.getIs_Active());
		System.out.println(e3.getGender());
		
		
	
		
		

	}

}

package ConstructorConcepts;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("Jag");
		e1.setAge(22);
		e1.setTeam("ILIM");

		System.out.println(e1.getName());

		System.out.println(e1.getAge());

	}

}

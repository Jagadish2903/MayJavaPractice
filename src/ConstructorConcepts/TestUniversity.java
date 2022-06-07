package ConstructorConcepts;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {
		
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Physics");
		obj1.add("Maths");
		obj1.add("Science");
		obj1.add("English");
		
		University obj=new University("Delhi", "Chennai", obj1);
		System.out.println(obj.getName());
		System.out.println(obj.getHQ());
		System.out.println(obj.getCourses());
		
	}

}

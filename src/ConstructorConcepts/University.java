package ConstructorConcepts;

import java.util.ArrayList;

public class University {

	private String name;
	private String HQ;
	private ArrayList<String> Courses;

	public University(String name, String hQ, ArrayList<String> courses) {
		this.name = name;
		this.HQ = hQ;
		this.Courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHQ() {
		return HQ;
	}

	public void setHQ(String hQ) {
		HQ = hQ;
	}

	public ArrayList<String> getCourses() {
		return Courses;
	}

	public void setCourses(ArrayList<String> courses) {
		Courses = courses;
	}

}

package JavaSessions;

public class Static_NonStatic {

	public static void add() {
		System.out.println("I am add Static method");
	}
	
	
	public void sub() {
		System.out.println("I am Sub Nonstatic method");
	}
	

	public static void main(String[] args) {

		
		Static_NonStatic obj=new Static_NonStatic();
		
		//Calling non Static method using object reference
		obj.sub();
		
		//Calling Static method
		//1.Using Class name
		Static_NonStatic.add();
		//2.using Object reference
		obj.add();
		//3. Calling directly
		add();
		
		//always recommended to use using class name for calling static method
		
		
		
		
		
	}

}

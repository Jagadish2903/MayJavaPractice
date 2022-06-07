package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		
		 int a = 10;
		 int b = 0;
		
		

		System.out.println("Hi");

		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("AE is coming.... ");
//			e.printStackTrace();
		}
		System.out.println("Bye");
		

	}

}

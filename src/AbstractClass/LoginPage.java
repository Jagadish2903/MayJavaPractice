package AbstractClass;

public class LoginPage extends Page {

	@Override
	public void logo() {
		System.out.println("Login Page Logo");
		
	}

	@Override
	public void Title() {
		System.out.println("Login Page Title....");
		
	}
	
	@Override
public void footerlinks() {
		
		System.out.println("LoginPage footerlinks");
	}
		
		
	public void pageNumber() {
		System.out.println("LoginPage Page Number");
	}
	
	public static void header() {
		System.out.println("LoginPage Header");
	}
	
	
	
	public final void username(int a) {
		System.out.println("Login final Page");
	}
	
	
	
	
	
	
}

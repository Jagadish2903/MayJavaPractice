package AbstractClass;

public  abstract class  Page {

	public abstract void logo();
	
	public abstract void Title();
	
	public void footerlinks() {
		
		System.out.println("Page footerlinks");
	}
	
	//method hiding the static method
	public static void header() {
		System.out.println("Page Header");
	}
	
	//default method
	
	public final void username() {
		System.out.println("final Page");
	}
	
}

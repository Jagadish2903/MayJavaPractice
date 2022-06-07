package AbstractClass;

public class TestPage {

	public static void main(String[] args) {
		
		//Top Casting
		Page p=new LoginPage();
		p.Title();
		p.username();
		p.logo();
		p.footerlinks();
		p.header();
	
		
		
		System.out.println("============================================");
		
		
		LoginPage lp=new LoginPage();
		lp.footerlinks();
		lp.logo();
		lp.Title();
		lp.pageNumber();
		lp.username(10);
		
		
	}

}

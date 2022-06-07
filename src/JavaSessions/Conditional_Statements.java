package JavaSessions;

public class Conditional_Statements {

	public static void main(String[] args) {

		
		int a=12;
		int b=12;
		
		if(a>b) {
			System.out.println("A is greater");
		}
		else {
			System.out.println("A is small");
		}
	
	
	int j=24;
	
	if(j>21) {
			System.out.println("j is greater than 21");
			if(j<24) {
				System.out.println("j is smaller than 24");
					if(j==22) {
							System.out.println("j is equal");
								}else {
						System.out.println("you are wrong");
						}
						}else{ 
							System.out.println(" you are right");
							}
				
	}else {
		System.out.println("Hi");
	}
	
	
	
	
	String browser="IE";
	
	
	if(browser.equals("Chrome")) {
		System.out.println("Chrome is launching....");
	}else if(browser.equals("Edge")){
		System.out.println("Edge is launching");
	}else {
		System.out.println("IE is launched");
	}
		
	}
}


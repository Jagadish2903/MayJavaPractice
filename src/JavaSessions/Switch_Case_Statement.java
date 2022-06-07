package JavaSessions;

public class Switch_Case_Statement {

	public static void main(String[] args) {

		String browser="yu";
		
		switch (browser.toUpperCase()) {
		case "chrome":
			System.out.println("chrome is launching...");
			break;
		case "firefox":
			System.out.println("firefox is launching...");
			break;
		case "IE":
			System.out.println("IE is launching...");
			break;

		default:
			System.out.println("Edge is launching");
			break;
		}
	}

}

package WebDriver_Architec;

public class AppTest {

	static WebDriver driver;
	
	
	public static void main(String[] args) {

		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			System.out.println("please pass the right browser");
		}
		
		
		
		driver.findElement();
		driver.findElements();
		
		driver.getUrl();
		driver.sendKeys("Jaggu");
		driver.doClick();
		
		
		
	}

}

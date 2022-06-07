package WebDriver_Architec;

public class ChromeDriver implements WebDriver {

	public void findElement() {
		System.out.println("Find Element");
	}

	public void findElements() {
		System.out.println("Find Elements");
	}

	public String getUrl() {
		return "www.amazon.com";
	}

	public void doClick() {
		System.out.println("Click ");
	}

	@Override
	public void sendKeys(String userName) {
		System.out.println("Jaggu");
	}

}

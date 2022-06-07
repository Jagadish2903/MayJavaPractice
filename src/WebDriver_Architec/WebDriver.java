package WebDriver_Architec;

public interface WebDriver extends SearchContext{

	
	@Override
	public void findElement();
	
	
	@Override
	public void findElements();
	
	
	public String getUrl();
	
	public void doClick();
	
	public void sendKeys(String userName);


	
}

package selenium;

public class Navigation extends Base

{
	
	public void navigationcommand()
	{
		driver.navigate().to("https://www.amazon.in/");// to navigate from one site to another
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) 
	{

		Navigation navigate = new Navigation();
		navigate.initializeBrowser();
		navigate.navigationcommand();
	}

}

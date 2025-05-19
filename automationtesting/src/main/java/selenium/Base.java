package selenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

  
  
public class Base 
  {
	
	WebDriver driver; // to get access to other methods
	
	public void initializeBrowser()
	{
		 driver = new ChromeDriver(); // invoke browser
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}

	public void closeAndQuit()
	{
		//driver.close(); - last opened window will close
		driver.quit();// whole browser will close
	}
	
	public static void main(String[] args) 
	
	{

		Base base = new Base();
		base.initializeBrowser();
        base.closeAndQuit();
	}

}

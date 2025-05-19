package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void idlocator()
	{
		WebElement messagefield = driver.findElement(By.id("button-one"));
		WebElement inputfield = driver.findElement(By.id("value-a"));
	}
	
	public void classlocator()
	{
		WebElement messagefield = driver.findElement(By.className("form-control"));// locators should be unique
	}
	
	public void namelocator()
	{
		WebElement namefield = driver.findElement(By.name("viewport"));// inspecting by name locator
	    WebElement content = driver.findElement(By.name("author"));
	}
	public void linktext()
	{
		WebElement radiobutton = driver.findElement(By.linkText("radio-button-demo.php"));
	    WebElement checkbox = driver.findElement(By.linkText("check-box-demo.php"));//to find the locators of link by using linktext by href
	}
	 public void partialLinkText()
	 {
		 WebElement checkbox = driver.findElement(By.partialLinkText("check-box"));//part of link is needed to find the element
	 }
	 public void csslocator()
	 {
		 WebElement checkbox = driver.findElement(By.cssSelector("input.form-check-input"));//tag.class
	 }
	 public void cssTagAndId()
	 {
		 WebElement username = driver.findElement(By.cssSelector("input#validationCustomUsername"));//tag#id
	 }
	 public void cssTagAndAttribute()
	 {
		 WebElement gettotal = driver.findElement(By.cssSelector("button[id=button-two]"));//tag and attribute
	 }
	public void cssTagClassAndAttribute()	
	{
	 WebElement ajax = driver.findElement(By.cssSelector("textarea.form-control[id=description]"));//tag,class and attribute
	 }
	 
	 
     
	public static void main(String[] args)
	{  
     
		

	}

}

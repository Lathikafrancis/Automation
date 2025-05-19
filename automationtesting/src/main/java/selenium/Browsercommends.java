package selenium;

public class Browsercommends extends Base 
{
	
	public void browserCommands()
	{
		String title = driver.getTitle();//to get the title
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();// to get the url of current page
		System.out.println(currenturl);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) 
	{

		Browsercommends commands = new Browsercommends();
		commands.initializeBrowser();
		commands.browserCommands();
		commands.closeAndQuit();
	}

}
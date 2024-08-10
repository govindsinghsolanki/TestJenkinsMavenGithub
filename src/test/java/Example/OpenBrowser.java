package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

	@Test
	public void testOpenBrowser()	
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Browser is open");
			
	}
}

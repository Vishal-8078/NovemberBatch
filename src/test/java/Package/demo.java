package Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	
	ChromeDriver driver;
	
	@Test
	
	public void test()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}

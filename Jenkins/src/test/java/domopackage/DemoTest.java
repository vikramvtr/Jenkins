package domopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void jenkins()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Created jenkins and opened browser",true);
		Reporter.log("Checking the Jenkins after code change",true);
	}

}

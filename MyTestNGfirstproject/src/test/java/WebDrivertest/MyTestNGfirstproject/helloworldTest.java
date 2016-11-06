package WebDrivertest.MyTestNGfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

 public class helloworldTest {
	@Test
	public void test()
	{
		System.out.println("Hello Bhargavi");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\bhargavi\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}

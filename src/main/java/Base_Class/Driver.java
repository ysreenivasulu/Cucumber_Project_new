package Base_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driver {

	public  WebDriver driver;
//	@BeforeMethod
	public  void setup() {
		
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.meesho.com/");
		
	}
//	@AfterMethod()
	public void close(){
		
		driver.close();
	}

}

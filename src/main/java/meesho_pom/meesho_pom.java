package meesho_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class meesho_pom {


	public WebDriver driver; 
	
	@FindBy(xpath="//span[contains(text(),'Home & Kitchen')]") public WebElement home;
	@FindBy(xpath="//p[contains(text(),'Clocks')]")public WebElement clock;
	@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div[1]/div/div/div[3]/div[2]/div[2]/div[1]/div[4]/a/div/div[2]/div[1]/span/p")public WebElement login;

	
	
	public meesho_pom(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);    //  if you this key use @findBy this line should be use
	}
	
	

	public void movetohome(){
		
		Actions a=new Actions(driver);
		a.moveToElement(home).perform();
		
	
	}
	
	public void clickclock(){
		
		Actions a=new Actions(driver);
		a.moveToElement(clock).click().build().perform();
	}
	
	public void radiobtn() throws Throwable {
		
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Gifts')]"));
		Thread.sleep(3000);
		if(ele.isDisplayed())
		{
			ele.click();
		}
	}
	
	public void clickwallclock() {
		login.click();
	}
}

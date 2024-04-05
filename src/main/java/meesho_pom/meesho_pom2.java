package meesho_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class meesho_pom2 {

	public WebDriver driver; 
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[4]/div[1]/div[7]") public WebElement home;
	@FindBy(xpath="//p[contains(text(),'Soft Toys')]")public WebElement toys;
	@FindBy(xpath="//body/div[@id='__next']/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/a[1]/div[1]/div[1]/img[1]")public WebElement img;
	@FindBy(xpath="//span[contains(text(),'Buy Now')]")public WebElement Buynow;

	
	
	public meesho_pom2(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this); 
	}
	
	

	public void movetohome(){
		
		Actions a=new Actions(driver);
		a.moveToElement(home).perform();
		
	
	}
	
	public void clickclock(){
		
		Actions a=new Actions(driver);
		a.moveToElement(toys).click().build().perform();
	}
	
	public void radiobtn() throws Throwable {
		
	
		Thread.sleep(3000);
			img.click();
		
	}
	
	public void clickwallclock() throws Throwable {
		Buynow.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

}

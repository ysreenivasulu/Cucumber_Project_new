package meesho_pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class meesho_pom_buatyAndHealth {

	public WebDriver driver; 
	
	@FindBy(xpath="//span[contains(text(),'Beauty & Health')]") public WebElement BuatyHealth;
	@FindBy(xpath="//p[contains(text(),'Face')]")public WebElement Face;
	@FindBy(xpath="//*[@id=\"__next\"]/div[3]/div[1]/div/div/div[3]/div[1]/div/div[2]/div[3]/div[3]/div[1]/div[2]/div/div/span[3]")public WebElement Blue;
	@FindBy(xpath="//p[contains(text(),'Fancy Face Makeup Combo')]")public WebElement FaceMakup;
	
	
	
	public meesho_pom_buatyAndHealth(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);    //  if you this key use @findBy this line should be use
	}
	
	

	public void BuatyHealth(){
		
		Actions a=new Actions(driver);
		a.moveToElement(BuatyHealth).perform();
		
	
	}
	
	public void Face(){
		
		Actions a=new Actions(driver);
		a.moveToElement(Face).click().build().perform();
	}
	
	public void Color() throws Throwable {
		Select s=new Select(driver.findElement(By.xpath("//span[contains(text(),'Color')]")));
		s.selectByVisibleText("Black");
		
		List <WebElement> elementCount = s.getOptions();
		System.out.println(elementCount.size());
	
	/*	WebElement ele=driver.findElement(By.xpath("//*[@id='__next']/div[3]/div[1]/div/div/div[3]/div[1]/div/div[2]/div[3]/div[3]/div[1]/div[1]"));
		Thread.sleep(3000);
		if(ele.isDisplayed())
		{
			ele.click();
		}  */
	}
	
	public void Blue() {
		Blue.click();
	}
	
	public void FaceMakup() {
		FaceMakup.click();
	}
}

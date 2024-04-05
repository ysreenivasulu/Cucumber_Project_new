package Definition_File;


import Base_Class.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import meesho_pom.meesho_pom;
import meesho_pom.meesho_pom2;
import meesho_pom.meesho_pom_buatyAndHealth;

public class meesho_1 extends Driver{

	
	meesho_pom ms;
	meesho_pom2 mss;
	meesho_pom_buatyAndHealth ms3;

@Given("User navigate to website")
public void user_navigate_to_website() {
  
	setup();
	
}

@When("user move to  Home and kitchen")
public void user_move_to_home_and_kitchen() {
	
	ms=new meesho_pom(driver);
	ms.movetohome();
}

@When("user click on clocks")
public void user_click_on_clocks() {
   
	ms.clickclock();
}

@When("use click on check box")
public void use_click_on_check_box() throws Throwable {
    
	ms.radiobtn();
	Thread.sleep(3000);
	ms.clickwallclock();
}

@When("user click on unique wall clock")
public void user_click_on_unique_wall_clock() throws Throwable {
	
	Thread.sleep(2000);
	mss=new meesho_pom2(driver);
	mss.movetohome();
	mss.clickclock();
	mss.radiobtn();
	Thread.sleep(3000);
	mss.clickwallclock();
}

@Then("user close the browser")
public void user_close_the_browser() throws Throwable {
	Thread.sleep(3000);
	ms3=new meesho_pom_buatyAndHealth(driver);
	ms3.BuatyHealth();
	ms3.Face();
	ms3.Color();
//	ms3.Blue();
	ms3.FaceMakup(); 
	Thread.sleep(3000);
	close();
	
}


}

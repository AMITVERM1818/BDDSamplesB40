package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UserLoginStepDef {
	
	WebDriver driver;	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();    
	}
	
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//	    driver.get("https://the-internet.herokuapp.com/login");
//	    driver.findElement(By.id("username")).sendKeys("tomsmith");
//	    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//	    driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
//	}

//	For Parametrization and Sceario OutLine
//	@When("User enters {string} and {string}")
//	public void user_enters_credentials(String strUser, String strPwd) {
//	    driver.get("https://the-internet.herokuapp.com/login");
//	    driver.findElement(By.id("username")).sendKeys(strUser);
//	    driver.findElement(By.name("password")).sendKeys(strPwd);
//	    driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
//	}
//	
	
//	Using DataTable as Lists
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable dataTable) {
//	
//		List<List<String>> users = dataTable.asLists();
////		Fetching User Name 
//		String strUser = users.get(0).get(0); 
////		Fetching Password
//		String strPwd = users.get(0).get(1);
//		driver.get("https://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys(strUser);
//	    driver.findElement(By.name("password")).sendKeys(strPwd);
//	    driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
//
//	}
	
//	Using DataTable as Maps
	@When("User enters credentials")
	public void user_enters_credentials(DataTable dataTable) {
	
		List<Map<String, String>> users = dataTable.asMaps();
//		Fetching User Name 
		String strUser = users.get(0).get("username"); 
//		Fetching Password
		String strPwd = users.get(0).get("password");
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys(strUser);
	    driver.findElement(By.name("password")).sendKeys(strPwd);
	    driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();

	}
	

	
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
		boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isDisp);
	}


}

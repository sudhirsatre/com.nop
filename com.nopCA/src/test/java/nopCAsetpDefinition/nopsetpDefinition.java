package nopCAsetpDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.nopCAPage.LoginPagenop;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class nopsetpDefinition {

	public WebDriver driver;
	public LoginPagenop lnop;
	
	
	@Given("User are open the browser {string}")
	public void user_are_open_the_browser(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		lnop=new LoginPagenop(driver);
		
	    
	}

	@Given("Enetr the username {string} and password {string}")
	public void enetr_the_username_and_password(String email, String pass) {
		
	
		lnop.loginemail(email);
		lnop.loginpassword(pass);
	    
	}

	@When("User should be click login button")
	public void user_should_be_click_login_button() {
		
		lnop.loginbutton();
	    
	}

	@When("User should be enter Dashbord")
	public void user_should_be_enter_dashbord() {
	    
	}

	@Then("User should be Logout")
	public void user_should_be_logout() throws Exception {
		Thread.sleep(3000);
		lnop.logout();
	
	}
	
	
	
	
}

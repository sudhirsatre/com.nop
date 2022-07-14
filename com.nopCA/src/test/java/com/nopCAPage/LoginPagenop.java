package com.nopCAPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagenop {
	
	public WebDriver driver;
	
	public LoginPagenop(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="Email")
	WebElement uemail;
	
	@FindBy(id="Password")
	WebElement upass;
	
	@FindBy(xpath = "//button[text()=\"Log in\"]")
	WebElement lbutton;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout1;
	
	public void loginemail(String email)
	{	
		uemail.clear();
		uemail.sendKeys(email);
	}
	
	public void loginpassword(String pass)
	{
		upass.clear();
		upass.sendKeys(pass);
	}
	
	public void loginbutton()
	{
		lbutton.click();
	}
	
	public void logout()
	{
		logout1.click();
	}
	

}

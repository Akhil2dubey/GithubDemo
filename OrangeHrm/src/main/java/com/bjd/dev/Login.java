package com.bjd.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
FirefoxDriver driver;
By unXpath=By.xpath("//input[@name='username']");
By pwXpath=By.xpath("//input[@name='password']");
By submitButtonXpath=By.xpath("//button[@type='submit']");


public Login(FirefoxDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void typeUsername()
{
driver.findElement(unXpath).sendKeys("Admin");	

}
public void typePassword()

{
driver.findElement(pwXpath).sendKeys("admin123");	
	
}
public void clickSubmitButton()
{
driver.findElement(submitButtonXpath).click();	
	
}

}

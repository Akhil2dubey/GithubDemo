package com.bjd.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {
	FirefoxDriver driver;
By oInc=By.xpath("//a[text()='OrangeHRM, Inc']");

public Homepage(FirefoxDriver d) {
	// TODO Auto-generated constructor stub
	driver=d;
}

public void clickoInc()
{
	driver.findElement(oInc).click();
}
}

package com.bjs.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.bjd.dev.Homepage;
import com.bjd.dev.Login;


public class OrangeHrmDemoTest {
  @Test 
	public static void unkowsMethod(){
		// TODO Auto-generated method stub
FirefoxDriver d=new FirefoxDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

Login l=new Login(d);

l.typeUsername();
l.typePassword();
l.clickSubmitButton();
Homepage h=new Homepage(d);
h.clickoInc();
	}

}

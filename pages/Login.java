package com.pages;

import org.openqa.selenium.By;


import com.newcustomer.base.Baseclass;

public class Login extends Baseclass{
	
	public void setUserid(String strUserName) {
		driver.findElement(By.name("uid")).sendKeys(strUserName);
		//driver.findElement(By.name("uid")).sendKeys(strUserName);
	}
public void setPassword(String password ) {
	driver.findElement(By.name("password")).sendKeys(password);
}
	public void clickLogin() {
		driver.findElement(By.name("btnLogin")).click();
	}

}

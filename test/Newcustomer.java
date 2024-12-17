
package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newcustomer.base.Baseclass;
import com.pages.Login;

public class Newcustomer extends Baseclass {
	
	Login login = new Login();
	
	  @BeforeTest
	  public void setdata() { 
		  excelFileName="tc001";
	  }
	  
	  
	 	@Test(dataProvider="testdata", dataProviderClass = Baseclass.class)
	
	public void test(String username , String password) {
		
		// to enter userid
//		driver.findElement(By.name("uid")).sendKeys(username);
	 		login.setUserid(username);
		
	//to enter password
//		driver.findElement(By.name("password")).sendKeys(password);
	 		login.setPassword(password);
		
	// to click login
	//	driver.findElement(By.name("btnLogin")).click();
	 		login.clickLogin();

	//to click new customer
		driver.findElement(By.linkText("New Customer")).click();
		

	//TO Enter customer name
		driver.findElement(By.name("name")).sendKeys("arun");
		
		// to click gender
		driver.findElement(By.name("rad1")).click();
		
		
		driver.findElement(By.id("dob")).sendKeys("04071996");
		
		
		//to enter address
		driver.findElement(By.name("addr")).sendKeys("Sri Koushigan plaza Selaiyur");
		
		driver.findElement(By.name("city")).sendKeys("Chennai");
		
		driver.findElement(By.name("state")).sendKeys("Tamilnadu");
		
		driver.findElement(By.name("pinno")).sendKeys("600100");
		
		driver.findElement(By.name("telephoneno")).sendKeys("9499009923");
		
	    driver.findElement(By.name("emailid")).sendKeys("mngr52558102@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("hEhyjEv");
		
		driver.findElement(By.name("sub")).click();
		
		
	}

}

package com.newcustomer.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.utils.Readexceldata;



public class Baseclass {
	//for driver intialization 
	public static RemoteWebDriver driver;
	public String excelFileName;
	
	@Parameters({"browserName","URL"})
	
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {
		if (browserName.equals("chrome")) {
			driver= new ChromeDriver();
		
		}
		else {
			driver=new EdgeDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		
	}
//	@AfterMethod
//	public void afterMethod() {
//		driver.quit();
//		
//	}
	@DataProvider	
	public String[][] testdata() throws IOException {
		return Readexceldata.getData(excelFileName);	
	}

}


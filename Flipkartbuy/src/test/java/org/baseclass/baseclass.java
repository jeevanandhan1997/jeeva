package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	
	public static WebDriver driver;
	public void launchBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	public void launchUrl(String string) {
	driver.get(string);
	
	}
	public void windowMax() {
		driver.manage().window().maximize();
	}
	public void passText (String string,WebElement element) {
		element.sendKeys(string);
	}
	public void clk (WebElement element) {
		element.click();
	}
}

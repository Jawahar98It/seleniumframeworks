package org.junittester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;
	public static void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchurl(String url) {
		driver.get(url);

	}
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static String pageTitle() {
		String title =driver.getTitle();
		return title;

	}
	
	public static String pageurl() {
		String url =driver.getCurrentUrl();
		return url;

	}
	public static void passText(String text, WebElement element)
	{
		element.sendKeys(text);
	}
	
	public static void submtbtn(WebElement element) {
		element.click();

	}
	
	public static void closeentirebrowser() {
		
		if(driver != null)
		{
	        driver.quit();
	        driver = null;

	}

}
}
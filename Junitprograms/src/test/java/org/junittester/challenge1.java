package org.junittester;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class challenge1 {
	@BeforeClass
	public static void launchthebrowser() 
	{
		System.out.println("Launching Browser");
	}
	
	@Test()
	public void tc1() {
		System.out.println("Test Case 1");
		
	}
	
	@Test
	public void tc2() {
		System.out.println("Test case2");
		

	}
	
	@Test
	public void tc3() {
		System.out.println("Test case3");
		

	}
	
	@Before
	public void startdate() {
		Date dat = new Date();
		System.out.println("Startdate: "+dat);

	}
	
	@After
	public void enddate() {
		Date dat = new Date();
		System.out.println("Enddate: "+dat);

	}
	
	@Test
	public void tc4() {
		System.out.println("Test case4");

	}
	
	
	@Test
	public void tc5() {
		System.out.println("Test case5");
		

	}
	
	@AfterClass
	public static void closebrowser() 
	{
		System.out.println("Closethe Browser");

	}
	
	

}

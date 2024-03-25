package org.junittester;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class challenge2 extends baseclass
{
	
	@Ignore
	@BeforeClass
	public static void launchthebrowser() 
	{
		launchbrowser();
		windowMaximize();
	}
	

	@Test()
	public void tc1() {
		System.out.println("Test Case 1");
		launchurl("https://mail.google.com/");
		
	}


	@Test
	public void tc2() {
		System.out.println("Test case2");
		launchurl("https://www.facebook.com/");
		String url=pageurl();
		String title=pageTitle();
		fblogin face = new fblogin();
		passText("testing@gmail.com",face.getEmail());
		Assert.assertTrue("Check ur page title",title.contains("facebook"));
		passText("Testing@123",face.getPassword());
		

	}


	@Test
	public void tc3() {
		System.out.println("Test case3");
		launchurl("https://inmakes.com/");

	}
	
	@Before
	public void startdate() {
		launchbrowser();
		windowMaximize();

	}
	
	@After
	public void enddate() {
		closeentirebrowser();

	}

	@Test
	public void tc4() {
		System.out.println("Test case4");
		launchurl("https://www.youtube.com/");

	}
	
	@Ignore
	@AfterClass
	public static void closebrowser() 
	{
		closeentirebrowser();

	}
	

}

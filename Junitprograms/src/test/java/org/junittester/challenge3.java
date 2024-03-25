package org.junittester;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class challenge3 extends baseclass {
	
	@BeforeClass
	public static void launchthebrowser() 
	{
		launchbrowser();
		windowMaximize();
	}
	
	@AfterClass
	public static void closebrowser() 
	{
		closeentirebrowser();

	}
	@Test()
	public void tc1() throws InterruptedException {
		System.out.println("Test Case 1");
		launchurl("https://mail.google.com/");
		String url=pageurl();
		String title=pageTitle();
		sampledata face = new sampledata();
		passText("testing@gmail.com",face.getEmail());
		Assert.assertTrue("Check ur page title",title.contains("Gmail"));
		submtbtn(face.getNextbtn());
		Thread.sleep(5000);
		passText("Testing@123",face.getPassword());
		
	}

}

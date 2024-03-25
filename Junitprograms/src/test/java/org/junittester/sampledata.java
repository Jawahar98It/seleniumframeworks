package org.junittester;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sampledata extends baseclass {
	public sampledata()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="identifier")
	private WebElement email;
	
	@FindBy(xpath="//*[text()=\"Next\"]")
	private WebElement nextbtn;
	
	@FindBy(xpath="//*[@aria-label=\"Enter your password\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[text()=\"Next\"]")
	private WebElement login;
	
	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	
	
	


}

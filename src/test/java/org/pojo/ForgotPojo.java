package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPojo extends BaseClass {
	public ForgotPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="identify_email")
	private WebElement forgotMail;

	public WebElement getForgotMail() {
		return forgotMail;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id="did_submit")
	private WebElement search;
	
	public WebElement getNoSearch() {
		return NoSearch;
	}

	@FindBy(xpath="//div[text()='No search results']")
	private WebElement NoSearch;
}

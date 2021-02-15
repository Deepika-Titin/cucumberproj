package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAZPojo extends BaseClass  {
	public LoginAZPojo() {
	PageFactory.initElements(driver, this);
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getBtnsearch() {
		return btnsearch;
	}
	public WebElement getSearchimg() {
		return searchimg;
	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	@FindBy(id="nav-search-submit-button")
	private WebElement btnsearch;
	@FindBy(xpath="(//img[@class='s-image'])[2]")
	private WebElement searchimg;
	public void searchAZ(String username) {
		fill(getSearch(), username);
	}
	public void btnsearch() {
		btnclick(getBtnsearch());
	}
	public void searchimg() {
		btnclick(getSearchimg());

	}
}

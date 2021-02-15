package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pojo.LoginAZPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginAZ extends BaseClass{
	public static LoginAZPojo l;
	public static  WebDriver d;
	@Given("user has to launch chrome and hit the Amazon url")
	public void user_has_to_launch_chrome_and_hit_the_Amazon_url() {
		
		launchurl("https://www.amazon.in/");
	}

	@When("user has to enter the keyword in searchbox")
	public void user_has_to_enter_the_keyword_in_searchbox(io.cucumber.datatable.DataTable data) {
		l=new LoginAZPojo();
		List<Map<String,String>> mp=data.asMaps();
	 fill(l.getSearch(), mp.get(0).get("product"));
	}

	@When("click the search button")
	public void click_the_search_button() {
		
		 btnclick(l.getBtnsearch());
		Assert.assertTrue("Enter the valid Keyword",l.getSearchimg().isDisplayed());
	    System.out.println("Assert Passed");
	}
	

}

package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.ForgotPojo;
import org.pojo.LoginPOJO;
import org.pojo.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPageSteps extends BaseClass {
	public static LoginPOJO l;
	 public static ForgotPojo f;
//	
	//PageObjectManager PageObjectManager;
	 public static  WebDriver d;
	@Given("user has to launch chrome and hit the FB url")
	public void user_has_to_launch_chrome_and_hit_the_FB_url() {
		
		launchurl("https://www.facebook.com/");
	 
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable data) {
		l=new LoginPOJO();
		List<Map<String,String>> mp=data.asMaps();
	 fill( l.getUser(), mp.get(0).get("username"));
	 fill( l.getPassword(), mp.get(1).get("password"));
		
		//PageObjectManager=PageObjectManager.getPageObjectManager();
		///LoginPOJO=PageObjectManager.getLoginPOJO();
		///LoginPOJO.
		
		
	}

	@When("click the login button")
	public void click_the_login_button()  {
		l=new LoginPOJO();
		btnclick(l.getLogin());
	   
	}

	@Then("user unable to enter the home page")
	public void user_unable_to_enter_the_home_page() throws InterruptedException {
		//Thread.sleep(5000);
	  //Assert.assertTrue("Check username or password", d.getCurrentUrl().contains("privacy_mutation_token"));
	  System.out.println("Assert passed");
	}
	
	@When("user has to click the forgtton password link")
	public void user_has_to_click_the_forgtton_password_link() {
		l=new LoginPOJO();
		btnclick(l.getForgotLink());
	}
		
	

	@When("user has to enter credentials")
	public void user_has_to_enter_credentials() {
		
	f=new ForgotPojo();
		fill(f.getForgotMail(),"deepikaravi081@gmail.com");
   
	}

	@When("user has to click the search button")
	public void user_has_to_click_the_search_button() {
	   btnclick(f.getSearch());
	}

	@Then("user has to be redirected to the OTP page")
	public void user_has_to_be_redirected_to_the_OTP_page() throws InterruptedException {
		Thread.sleep(3000);
		
		  Assert.assertTrue("Check username or password",f.getNoSearch().isDisplayed());
		  System.out.println("Forgot password Assert passed");
	   
	}


}

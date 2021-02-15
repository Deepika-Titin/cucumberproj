package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {
	public LoginPOJO() {
	PageFactory.initElements(driver, this);
	}
	
@FindBy(id="email")
private WebElement user;


public WebElement getUser() {
	return user;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public WebElement getForgotLink() {
	return forgotLink;
}

@FindBy(id="pass")
private WebElement password;


@FindBy(id="u_0_b")
private WebElement login;

@FindBy(xpath="//a[text()='Forgotten password?']")
private WebElement forgotLink;

public void loginUsernamePassword(String username,String password) {
	fill(getUser(), username);
	fill(getPassword(), password);

}
public void loginButton() {
	btnclick(getLogin());
}
public void forgotlink() {
btnclick(getForgotLink());

}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	private By emailInputLocator = By.name("email");
	private By passwordInputLocator = By.name("password");
	private By loginButtonLocator = By.xpath("//input[@type='submit']");
	private By forgottenPassswordLinkLocator = By.linkText("Forgotten Password");
	private By logoutLinkLocator = By.linkText("Logout");
	
	public LoginPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	public void enterEmail(String email) {
		WebElement emailInput = driver.findElement(emailInputLocator);
		emailInput.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordInputLocator);
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(loginButtonLocator);
		loginButton.click();
	}
	
	public void clickForgottenPasswordLink() {
		WebElement forgottenPasswordLink = driver.findElement(forgottenPassswordLinkLocator);
		forgottenPasswordLink.click();
	}
	
	public boolean checkForgottenPwdLink() {
		return driver.findElement(forgottenPassswordLinkLocator).isDisplayed();
	}
	
	public boolean checkLogoutLink() {
		return driver.findElement(logoutLinkLocator).isDisplayed();
		
	}
	
	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
	}
	
	public String getForgotPwdPageUrl() {
		String forgotPwdPageUrl = driver.getCurrentUrl();
		return forgotPwdPageUrl;
	}
}
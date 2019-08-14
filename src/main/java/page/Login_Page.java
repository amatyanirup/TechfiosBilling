package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page extends Base_Page {
	public WebDriver driver;

	public Login_Page(WebDriver  driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;
	@FindBy(how = How.NAME, using = "password")
	WebElement Password;
	@FindBy(how = How.NAME, using = "login")
	WebElement LoginButton;
	
	public void login(String userName, String password ) {
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		LoginButton.click();
	}	
}
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Testutil;

public class HomePage extends Base_Page {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath=("//*[@id=\"side-menu\"]/li[2]/a/span[1]"))WebElement crm;
	@FindBy(xpath=("//a[text()='Add Contact']"))WebElement Addcontact;



public void click_crm() {
	
	crm.click();
	
}
public void click_Addcontact() {
	Addcontact.click();
}
	
}


package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_ContactPage extends Base_Page {
WebDriver driver;
public Add_ContactPage(WebDriver driver) {
	this.driver=driver;
}
@FindBy(xpath=("//a[text()='Add Contact']"))WebElement Addcontact;
@FindBy(xpath=("//input[@id='account']"))WebElement Fullname;
@FindBy(xpath=("//input[@id='company']"))WebElement Companyname;
@FindBy(xpath=("//input[@id='email']"))WebElement Email;
@FindBy(xpath=("//input[@id='phone']"))WebElement phone;
@FindBy(xpath=("//input[@id='address']"))WebElement Address;
@FindBy(xpath=("//input[@id='city']"))WebElement city;
@FindBy(xpath=("//input[@id='state']"))WebElement State;
@FindBy(xpath=("//input[@id='zip']"))WebElement zip;
@FindBy(xpath=("//span[@id='select2-country-container']"))WebElement Country;

@FindBy(xpath=("//button[@id='submit']"))WebElement submit;







public void click_Addcontact() {
	Addcontact.click();
}
public void FillingUpAddressForm(String name,String comp,String email,String ph,
		String add ,String ci,String st,String zip1)
{
	Fullname.sendKeys(name);
	Companyname.sendKeys(comp);
	Email.sendKeys(email);
	phone.sendKeys(ph);
	Address.sendKeys(add);
	city.sendKeys(ci);
	State.sendKeys(st);
	zip.sendKeys(zip1);
	
	
}
public void click_country() {
	Country.click();	
}
public void click_submit() {
	submit.click();
}

}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Transactions extends Base_Page {
WebDriver driver;
public Transactions(WebDriver driver) {
	this.driver= driver;
}

@FindBy(xpath="//*[@id=\"side-menu\"]/li[3]/a/span[1]")WebElement Transactions;
@FindBy(xpath="//a[text()='New Deposit']")WebElement NewDeposit;
@FindBy(xpath="//select[@id='account']")WebElement Account;
@FindBy(xpath="//input[@id='description']")WebElement Description;
@FindBy(xpath="//input[@id='amount']")WebElement Amount;
@FindBy(id = "date")WebElement DateField;
@FindBy(xpath="//button[@id='submit']")WebElement btnsubmit;
@FindBy(xpath = "//h5[(text()='Add Deposit')]")
WebElement AddDepositPanelHeading;




public void clickTransaction() {
	Transactions.click();
}
public void clickNewDeposit() {
	NewDeposit.click();
}



public void fill_Transactionform(String description, String amount) {
	
	Description.sendKeys(description);
	Amount.sendKeys(amount);
	
}
public void click_btnsubmit() {
	btnsubmit.click();
}
public void selectFromDropDownForAdddeposit(String string) {
	//Account.click();
	Select AcctDropDown = new Select(Account);
	AcctDropDown.selectByVisibleText(string);
	
}
public void clearTheDateAndnputdeposit(String string) {
	DateField.clear();
	DateField.sendKeys(string);
	AddDepositPanelHeading.click();
	
}

}

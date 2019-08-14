package test;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Base_Page;
import page.HomePage;
import page.Login_Page;
import page.Transactions;

public class Transaction_Test extends Base_Page {
	@Test
	public void transaction_test() throws InterruptedException {
	driver=Base_Page.startBrowser("http://techfios.com/test/billing/?ng=admin/");
	Login_Page login_page = PageFactory.initElements(driver, Login_Page.class);
	login_page.login("techfiosdemo@gmail.com", "abc123");
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.click_crm();
	Transactions transactions = PageFactory.initElements(driver, Transactions.class);
	transactions.clickTransaction();
	transactions.clickNewDeposit();
	
	transactions.selectFromDropDownForAdddeposit("Syed");
	transactions.clearTheDateAndnputdeposit("2019-07-25");
	Thread.sleep(5000);
	Random ran = new Random();
	String description = "check"+ ran.nextInt(500) ;
	String amount = String.valueOf(ran.nextInt(5000));
	transactions.fill_Transactionform(description, amount);
	transactions.click_btnsubmit();
	driver.close();

	}
}

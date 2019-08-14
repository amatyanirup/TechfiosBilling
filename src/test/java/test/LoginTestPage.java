package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Add_ContactPage;
import page.Base_Page;
import page.HomePage;
import page.Login_Page;
import util.Excel_Reader;



public class LoginTestPage extends Base_Page {

	
@Test
	public void loginTestPage(){
	driver=Base_Page.startBrowser("http://techfios.com/test/billing/?ng=admin/");
	Login_Page login_page = PageFactory.initElements(driver, Login_Page.class);
	login_page.login("techfiosdemo@gmail.com", "abc123");
	//HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	//homepage.click_crm();
	//Add_ContactPage add_contactPage = PageFactory.initElements(driver, Add_ContactPage.class);
	//add_contactPage.click_Addcontact();
	//add_contactPage.click_submit();
	
	driver.close();
	
}
}



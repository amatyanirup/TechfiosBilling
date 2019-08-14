package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Add_ContactPage;
import page.Base_Page;
import page.HomePage;
import page.Login_Page;
import util.Excel_Reader;

public class AddContacttest extends Base_Page {
	public  WebDriver driver;
	Excel_Reader reader = new Excel_Reader("C:\\Users\\Nirup\\eclipse-workspace\\TechfiosBilling\\Data\\Book1.xlsx");
	String name = reader.getCellData("Sheet1", "FullName",2 );
	String comp = reader.getCellData("Sheet1", "CompanyName", 2);
	String email = reader.getCellData("Sheet1", "Email", 2);
	String ph = reader.getCellData("Sheet1", "Phone", 2);
	String add = reader.getCellData("Sheet1", "Address", 2);
	String ci = reader.getCellData("Sheet1", "City", 2);
	String st = reader.getCellData("Sheet1", "State/Region", 2);
	String zip1 = reader.getCellData("Sheet1", "ZIP/PostalCode", 2);
	
	@Test
	public void addcontacttest() {
		driver=Base_Page.startBrowser("http://techfios.com/test/billing/?ng=admin/");
		Login_Page login_page = PageFactory.initElements(driver, Login_Page.class);
		login_page.login("techfiosdemo@gmail.com", "abc123");
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.click_crm();
		Add_ContactPage add_contactPage = PageFactory.initElements(driver, Add_ContactPage.class);
		add_contactPage.click_Addcontact();
		
		add_contactPage.FillingUpAddressForm(name, comp, email, ph, add, ci, st, zip1);
		add_contactPage.click_country();
		add_contactPage.click_submit();
		driver.close();
	}

}

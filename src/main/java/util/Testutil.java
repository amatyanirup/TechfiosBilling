package util;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import page.Base_Page;

public class Testutil extends Base_Page {
 public static void action() {
	 Actions actions = new Actions(driver);
	 actions.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"side-menu\\\"]/li[2]/ul"))).build().perform();
 }

}

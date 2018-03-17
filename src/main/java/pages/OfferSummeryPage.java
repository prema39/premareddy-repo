package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ElementActions;

public class OfferSummeryPage extends ElementActions {

	public OfferSummeryPage(WebDriver driver) {
		super(driver);

	}

	By notifi_close_btn = By.xpath("//a[@class='notifications-layout__close' and @title='Close']");
	By hometab = By.linkText("Home");

	public HomePage clickOnHomeTab() {
		clickOn(notifi_close_btn);
		clickOn(hometab);
		return new HomePage(driver);
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ElementActions;

public class OfferSummeryPage extends ElementActions {

	public OfferSummeryPage(WebDriver driver) {
		super(driver);

	}

	By notifi_Close_Btn = By.xpath("//a[@class='notifications-layout__close' and @title='Close']");
	By homeTab = By.linkText("Home");

	public HomePage clickOnHomeTab() {
		clickOn(notifi_Close_Btn);
		clickOn(homeTab);
		return new HomePage(driver);
		
		
	}

}

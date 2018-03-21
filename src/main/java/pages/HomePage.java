package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.ElementActions;

public class HomePage extends ElementActions {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	By book_This_Room_Btn = By.linkText("Book this room");
	By holidayZante_Box = By.xpath("//h2[@class='return-to-offer-large__title']");
	By hotel_Details = By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[3]");

	public void clickOnBookThisButton() {

		Set<String> windows = driver.getWindowHandles();

		String secondWindow = new ArrayList<>(windows).get(1);
		driver.switchTo().window(secondWindow);

		Assert.assertTrue(driver.findElement(holidayZante_Box).isDisplayed());

		clickOn(book_This_Room_Btn);
		Assert.assertEquals("in Vassilikos, Zante", driver.findElement(hotel_Details).getText());
	}

}

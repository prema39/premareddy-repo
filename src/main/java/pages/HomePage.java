package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ElementActions;

public class HomePage extends ElementActions {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	By book_this_room_btn = By.linkText("Book this room");

	public void clickonBookThisButton() {

		Set<String> windows = driver.getWindowHandles();

		String secondWindow = new ArrayList<>(windows).get(1);
		driver.switchTo().window(secondWindow);

		clickOn(book_this_room_btn);
	}
}

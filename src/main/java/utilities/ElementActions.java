package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementActions {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected JavascriptExecutor js;

	public ElementActions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
		js = (JavascriptExecutor) driver;

	}

	public void clickOn(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
	}

}

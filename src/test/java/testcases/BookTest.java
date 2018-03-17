package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.OfferSummeryPage;

public class BookTest extends BaseTest {
	
	@Test
	public void initialise() {
		
		OfferSummeryPage osp= new OfferSummeryPage(driver);
		osp.clickOnHomeTab();
		
		HomePage hp= new HomePage(driver);
		hp.clickonBookButton();
	}
}



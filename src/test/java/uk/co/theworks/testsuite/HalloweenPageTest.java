package uk.co.theworks.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.theworks.pages.HomePage;
import uk.co.theworks.pages.OffersPage;
import uk.co.theworks.testbase.BaseTest;

/**
 * Author - Sarvat Shaikh
 * Project Name: The-Works-B2S
 */
public class HalloweenPageTest extends BaseTest {

    HomePage homePage;
    OffersPage offersPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        offersPage = new OffersPage();
    }


    @Test
    public void clickOnOffersTab() {
        homePage.acceptingTheCookies();
        homePage.hooverOnOffers();
        homePage.clickHalloween();
        offersPage.add2basket();
        offersPage.addQuantity("2");
        offersPage.clickOnCheckOutNow();
        offersPage.clickOnUpdateButton();
        offersPage.clickOnCheckOutNow();
    }
}

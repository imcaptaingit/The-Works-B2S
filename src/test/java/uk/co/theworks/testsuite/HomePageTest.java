package uk.co.theworks.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uk.co.theworks.customlisteners.CustomListeners;
import uk.co.theworks.pages.HomePage;
import uk.co.theworks.pages.KidsPage;
import uk.co.theworks.testbase.BaseTest;

/**
 * Author - Sarvat Shaikh
 * Project Name: The-Works-B2S
 */
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {
    HomePage homePage;
    KidsPage kidsPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        kidsPage = new KidsPage();
    }
    @Test
    public void acceptCookies(){
        homePage.acceptingTheCookies();
    }
    @Test
    public void Test001() {
        homePage.clickOnKidsLink();
    }

    @Test
    public void test002() {
        kidsPage.clickOnToysCategoryLink();

    }
}

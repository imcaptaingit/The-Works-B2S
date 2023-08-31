package uk.co.theworks.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uk.co.theworks.customlisteners.CustomListeners;
import uk.co.theworks.pages.HomePage;
import uk.co.theworks.testbase.BaseTest;

/**
 * Author - Sarvat Shaikh
 * Project Name: The-Works-B2S
 */
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {
    HomePage homePage;


    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();


    }
    @Test

    public void Test001(){
        homePage.clickOnKidsLink();
    }

}

package uk.co.theworks.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uk.co.theworks.customlisteners.CustomListeners;
import uk.co.theworks.pages.KidsPage;
import uk.co.theworks.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class KidsPageTest extends BaseTest {
    KidsPage kidsPage;

    @BeforeMethod
    public void inIt() {
        kidsPage = new KidsPage();

    }

    @Test
    public void test002() {
        kidsPage.clickOnToysCategoryLink();
        kidsPage.selectCategory();
        kidsPage.selectToy();

    }
}
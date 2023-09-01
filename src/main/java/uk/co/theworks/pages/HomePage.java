package uk.co.theworks.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.theworks.utility.Utility;

/**
 * Author - Jaydeep Patel
 * Project Name: The-Works-B2S
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(xpath = "//button[@id='consent_affirm']")
    WebElement AcceptCookies;

    @CacheLookup
    @FindBy(xpath = "//a[@class='desktop-nav-link desktop-nav-link-2 ']")
    WebElement kids;

    @CacheLookup
    @FindBy(xpath = "//a[contains(@class,'desktop-nav-link desktop-nav-link-6')]")
    WebElement Offers;

    @CacheLookup
    @FindBy(linkText = "New Halloween")
    WebElement Halloween;

    public void clickOnKidsLink() {
        clickOnElement(kids);
    }

    public void acceptingTheCookies() {
        clickOnElement(AcceptCookies);
    }

    public void hooverOnOffers() {
        mouseHoverToElement(Offers);
    }

    public void clickHalloween() {
        clickOnElement(Halloween);
    }
}

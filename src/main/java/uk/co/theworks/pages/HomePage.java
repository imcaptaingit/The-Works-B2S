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
    @FindBy (xpath = "//a[@class='desktop-nav-link desktop-nav-link-2 ']")
    WebElement kids;



    public void clickOnKidsLink(){
        clickOnElement(kids);
    }




}

package uk.co.theworks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.theworks.utility.Utility;

/**
 * Author - Jaydeep Patel
 * Project Name: The-Works-B2S
 */
public class HomePage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//header/nav[1]/div[1]/div[3]/nav[1]/ul[1]/li[2]/a[1]")
    WebElement kids;



    public void clickOnKidsLink(){
        clickOnElement(kids);
    }




}

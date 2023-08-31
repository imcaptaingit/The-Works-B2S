package uk.co.theworks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.theworks.utility.Utility;

public class kidsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='lhn-level-2']//a[contains(text(),'Toys for 3-5 Year Olds')]")
    WebElement toys3To5;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'PlayWorks Fire Engine')]")
    WebElement selectToy;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'PlayWorks Fire Engine')]")
    WebElement text;

    public void clickOnToysCategoryLink() {
        clickOnElement(toys3To5);
    }

    public void dropDownPageAndSelectToy() {
        clickOnElement(selectToy);
    }

    public String verifyText() {
        return getTextFromElement(text);
    }

}
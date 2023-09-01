package uk.co.theworks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.theworks.utility.Utility;

public class KidsPage extends Utility {
    @CacheLookup
    @FindBy (xpath = "//a[@class='desktop-nav-link desktop-nav-link-2 ']")
    WebElement kids;

    @CacheLookup
    @FindBy(xpath = "//li[@class='mega-nav-col mega-nav-col-2']//ul//li//a[contains(text(),'Toys for 3-5 Year Olds')]")
    WebElement toys3To5;

    @CacheLookup
    @FindBy(xpath = "//button[@id='atc_WKS_5050841656510']")
    WebElement toy;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'PlayWorks Fire Engine')]")
    WebElement text;

    public void clickOnToysCategoryLink() {
       mouseHoverToElementAndClick(kids);
    }

    public void selectCategory() {
        clickOnElement(toys3To5);
    }

   public void selectToy(){
    clickOnElement(toy);
   }

}
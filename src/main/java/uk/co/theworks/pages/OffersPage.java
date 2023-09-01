package uk.co.theworks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.theworks.utility.Utility;

/**
 * Author - Sarvat Shaikh
 * Project Name: The-Works-B2S
 */
public class OffersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@id='atc_WKS_5052089340565']")
    WebElement add2BasketSpookyDuck;

    @CacheLookup
    @FindBy(css = "#quantity-167bd058b043d0123acacea869")
    WebElement addQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@class='quantity-update btn btn-tertiary']")
    WebElement clickOnUpdate;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-tertiary']")
    WebElement clickOnCheckOutNow;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-6 cart-totals']//div[@class='row cart-totals-order-total']//div[@class='col-4']//p[@class='text-right cart-totals-grand-total'][contains(text(),'£7.99')]")
    WebElement verifyOrderTotal;

    public void add2basket(){
        clickOnElement(add2BasketSpookyDuck);
    }

    public void addQuantity(String quantity){
        sendTextToElement(addQuantity,quantity);
    }
    public void clickOnUpdateButton(){
        clickOnElement(clickOnUpdate);
    }
    public void clickOnCheckOutNow(){
        clickOnElement(clickOnCheckOutNow);
    }
    public void verifyOrderTotal(){
    }

}

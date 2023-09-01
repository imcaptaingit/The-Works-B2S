package uk.co.theworks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.theworks.utility.Utility;

public class ToysAndGamesPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "")
    WebElement popo;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement poo;
}

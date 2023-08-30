package uk.co.theworks.testbase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.theworks.propertyreader.PropertyReader;
import uk.co.theworks.utility.Utility;


/**
 * Author - Sarvat Shaikh
 * Project Name: The-Works-B2S
 */

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}

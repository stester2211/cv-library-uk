package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility
{
    //2.ResultPage
    //  Locators - resultText
    @CacheLookup
    @FindBy(xpath="//h1[@class='search-header__title']")
    WebElement resultText;

    public String verifyResultText(String result)
    {
        //verify the result 'result'
        return getTextFromElement(resultText,result);
    }
}

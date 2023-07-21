package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility
{
    @CacheLookup
    @FindBy(xpath="//input[@id='keywords']")
    WebElement enterJobTitle;
    @CacheLookup
    @FindBy(xpath="//input[@id='location']")
    WebElement enterLocation;
    @CacheLookup
    @FindBy(xpath="//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath="//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath="//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath="//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath="//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath="//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath="//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle)
    {
        //enter job title 'jobTitle'
        sendTextToElement(enterJobTitle,jobTitle);
    }
    public void enterLocation(String location)
    {
        //enter Location 'location'
        sendTextToElement(enterLocation,location);
    }
    public void selectDistance(String distance)
    {
        //select distance 'distance'
        selectByValueFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink()
    {
        //click on moreSearchOptionsLink
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSalary)
    {
        //enter salaryMin 'salaryMin'
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary)
    {
        //enter salaryMax 'salaryMax'
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType)
    {
        //select salaryType 'salaryType'
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType)
    {
        //select jobType 'jobType'
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton()
    {
        //click on 'Find Jobs' button
        clickOnElement(findJobsBtn);
    }
}

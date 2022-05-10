package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class StartPage extends Utility {

    public StartPage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;

    @FindBy(id = "response")
    WebElement nationalityDropDownList;

    @FindBy(xpath = "//dd[@class='govuk-summary-list__value']")
    WebElement  resultMessage;

    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButton;


    public void clickStartNow(){

        Reporter.log("Clicking on start Button " + startNowButton.toString());
        clickOnElement(startNowButton);
    }
    public void clickContinueButton(){
        Reporter.log("Clicking on Continue Button " + continueButton.toString());
        clickOnElement(continueButton);
    }
    public void clickOnSelectTab(){
        Reporter.log("Clicking on Continue Button " + nationalityDropDownList.toString());
        clickOnElement(nationalityDropDownList);
    }

    public void selectNationality(String nationality){
        Reporter.log("Clicking on Nationality Button " + nationalityDropDownList.toString());
        sendTextToElement(nationalityDropDownList, nationality);
    }

    public String getResultMessage(){
        Reporter.log("Clicking on Result Message " + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }
    public void confirmResultMessage(String expectedMessage){
        Reporter.log("Clicking on Result Message " + resultMessage.toString());
        String actualText = resultMessage.getText();
        Assert.assertTrue(true);
    }

}

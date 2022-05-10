package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {

   public FamilyImmigrationStatusPage() {

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yes;

    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement  nextStepButton;

    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement verifyText;

    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement verifyWorkText;



    public void clickOnNextButton(){
        Reporter.log("Clicking on next Button " + nextStepButton.toString() + "<br>");
        clickOnElement(nextStepButton);
    }

    public void selectImmigrationStatus(String status){
        Reporter.log("select immigration status" + yes.toString() + "<br>");
        clickOnElement(yes);

    }
    public String getVerificationText(){
        Reporter.log("Verify visa text" + verifyText.toString() + "<br>");
        return getTextFromElement(verifyText);
    }
    public String getWorkVerificationText(){
        Reporter.log("Verify work text" + verifyWorkText.toString() + "<br>");
        return getTextFromElement(verifyWorkText);
    }


}

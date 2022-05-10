package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {

    public ReasonForTravelPage(){

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "response-0")
    WebElement  reasonForVisitList;

    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement  nextButton;

    public void selectReasonForVisit(String reason){
        Reporter.log("Select reason for Visit" + reasonForVisitList.toString());
        sendTextToElement(reasonForVisitList, reason);
    }

    public void nextPageButton(){
        Reporter.log("Select next page button" + reasonForVisitList.toString());
        clickOnElement(nextButton);
    }


}

package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ResultPage extends Utility {

   public ResultPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "response-0")
    WebElement reasonForVisitList;

   @FindBy(id = "response-1")
    WebElement workVisit ;

    @FindBy(id = "response-4")
    WebElement joinFamily ;


    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement clickOnContinue;

    public void selectReasonForVisit(String reason) {
        Reporter.log("select reasone for visit" + reasonForVisitList.toString());
        clickOnElement(reasonForVisitList);

    }
    public void selectReasonForVisitWork(String reason) {
        Reporter.log("select reasone for visit" + workVisit.toString());
        clickOnElement(workVisit);

    }
    public void selectReasonForVisitFamily(String reason) {
        Reporter.log("select reasone for visit " + joinFamily.toString());
        clickOnElement(joinFamily);

    }
    public void clickNextStepButton(){
        Reporter.log("Clicking on next step buttton " + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

}
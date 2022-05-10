package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {

  public   DurationOfStayPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;

    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextButton;


    public void selectLengthOfStay(String moreOrLess) {
        Reporter.log("Clicking on length of stay " + lessThanSixMonths.toString() + "<br>");
        clickOnElement(lessThanSixMonths);
    }
    public void selectMoreOfStay(String moreOrLess) {
        Reporter.log("Select more stay" + moreThanSixMonths.toString() + "<br>");
        clickOnElement(moreThanSixMonths);
    }

    public void clickNextStepButton() {

        clickOnElement(nextButton);
    }


}
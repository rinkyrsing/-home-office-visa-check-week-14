package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    StartPage startPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    ReasonForTravelPage reasonForTravelPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod(alwaysRun = true)
    public void init(){

        startPage = new StartPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void anAustralianCominToUKForTourism(){
        startPage.clickStartNow();
        startPage.selectNationality("Australia");
        startPage.clickOnSelectTab();
        startPage.clickContinueButton();
        resultPage.selectReasonForVisit("Tourism");
        resultPage.clickNextStepButton();
        String expectedText = "You will not need a visa to come to the UK";
        String actualText = familyImmigrationStatusPage.getVerificationText();
        Assert.assertEquals(actualText, expectedText, "Error found");

    }

    @Test(groups = {"smoke", "regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){

        startPage.clickStartNow();
        startPage.selectNationality("Chile");
        startPage.clickContinueButton();
        resultPage.selectReasonForVisitWork("Work, academic visit or business");
        resultPage.clickNextStepButton();
        durationOfStayPage.selectMoreOfStay("longer than 6 months");
        durationOfStayPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Health and care professional");
        reasonForTravelPage.nextPageButton();
        String expectedText = "You need a visa to work in health and care";
        String actualText = familyImmigrationStatusPage.getVerificationText();
        Assert.assertEquals(actualText, expectedText, "Error found");


    }

    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickStartNow();
        startPage.selectNationality("Colombia");
        startPage.clickContinueButton();
        resultPage.selectReasonForVisitFamily("Join partner or family for a long stay");
        resultPage.clickNextStepButton();
        familyImmigrationStatusPage.selectImmigrationStatus("yes");
        familyImmigrationStatusPage.clickOnNextButton();
        String expectedText = "You’ll need a visa to join your family or partner in the UK";
        String actualText = familyImmigrationStatusPage.getVerificationText();
        Assert.assertEquals(actualText, expectedText, "Error found");

    }


}

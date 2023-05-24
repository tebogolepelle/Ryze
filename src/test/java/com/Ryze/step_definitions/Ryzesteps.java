package com.Ryze.step_definitions;

import com.Ryze.pages.*;
import com.Ryze.utilities.ConfigurationReader;
import com.Ryze.utilities.Driver;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Ryzesteps {

    private WebDriver driver = Driver.getDriver();
    RyzeLandingPage dealxpage = new RyzeLandingPage(driver);
    DashBoardPage dashBoardPage = new DashBoardPage(driver);
    StudiesPage studiesPage = new StudiesPage(driver);
    DataAcquisitionPage dataAcquisitionPage = new DataAcquisitionPage(driver);
    FormsPage formsPage = new FormsPage(driver);

    Logger log = Logger.getLogger(RyzeLandingPage.class);
    String description;

    @Given("I am on the landing page")
    public void iAmOnTheLandingPage() {

        try {
            //Loading the home page
            driver.get(ConfigurationReader.getProperty("url"));
            WebDriver driver = Driver.getDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        } catch (Exception err) {
            log.info("failed to load home page " + err.getMessage());
        }
    }

    @When("^I login into the application using \"(.*)\" and \"(.*)\"$")
    public void loginIntoTheApplicationUsingAndPaasword(String username, String password) {

        //Fill in login details
        dealxpage.userNameBox.sendKeys(username);
        dealxpage.passwordBox.sendKeys(password);
        dealxpage.signInBtn.click();
    }

    @And("I am on the Repository tab")
    public void iAmOnTheRepositoryTab() {

        dashBoardPage.repositoryTab.click();
        dashBoardPage.studiesTab.click();
    }

    @And("Enter the tech test study view")
    public void enterTheTechTestStudyView() {

        studiesPage.viewLink.click();
        studiesPage.menuToggle.click();
    }

    @And("Enter the Data acquisition asset group view")
    public void enterTheDataAcquisitionAssetGroupView() {

        dataAcquisitionPage.dataAcquisitionLink.click();
    }

    @And("Select to view Forms")
    public void selectToVieForms() {

        formsPage.formsLink.click();
    }

    @And("Select to view the Medical History form")
    public void selectToViewTheMedicalHistoryForm() {
        formsPage.medicalHistoryLink.click();
        formsPage.vieweditFormBtn.click();
    }

    @And("Add a \"<description>\" property to the form")
    public void addADescriptionPropertyToTheForm() {
        formsPage.descriptionText.sendKeys(description);
        formsPage.updateBtn.click();
    }

    @Then("Confirm the user update has been preserved on the property panel \"<description>\"$")
    public void confirmTheUserUpdateHasBeenPreservedOnThePropertyPanel() {

        formsPage.getAndValidateDescription(description);
    }

    @Then("Logout of the application")
    public void logoutOfTheApplication() {
        formsPage.menuUserBtn.click();
        formsPage.logoutBtn.click();
    }
}

package com.Ryze.pages;

import com.Ryze.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "FORMTypeName")
    public WebElement formsLink;

    @FindBy(how = How.ID, using = "uuid-e6493d77-5f36-48e6-b7fb-3610bc0e33d9")
    public WebElement medicalHistoryLink;

    @FindBy(how = How.ID, using = "switchEditMode")
    public WebElement vieweditFormBtn;

    @FindBy(how = How.ID, using = "assetLocaleEditTextTextareadescription")
    public WebElement descriptionText;

    @FindBy(how = How.ID, using = "saveAsset")
    public WebElement updateBtn;

    @FindBy(how = How.ID, using = "menuUser")
    public WebElement menuUserBtn;

    @FindBy(how = How.ID, using = "menuUserLogout")
    public WebElement logoutBtn;

    @FindBy(how = How.ID, using = "formDescription")
    public WebElement descriptionLbl;

    public boolean getAndValidateDescription(String description){

        boolean validation = false;
        try{

            if(description.equalsIgnoreCase(descriptionLbl.getText().toString())){

                validation = true;

            }
            else{

                validation = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return validation;
    }

    public FormsPage(WebDriver driver) {
        this.driver = Driver.getDriver();
        PageFactory.initElements(this.driver, this);
    }
}

package com.Ryze.pages;

import com.Ryze.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RyzeLandingPage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "username")
    public WebElement userNameBox;

    @FindBy(how = How.ID, using = "password")
    public WebElement passwordBox;

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement signInBtn;

    public RyzeLandingPage(WebDriver driver) {
        this.driver = Driver.getDriver();
        PageFactory.initElements(this.driver, this);
    }
}

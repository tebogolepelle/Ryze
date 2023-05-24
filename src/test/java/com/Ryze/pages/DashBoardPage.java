package com.Ryze.pages;

import com.Ryze.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id='menuMdb']/fdx-main-nav-item/div/p[1]")
    public WebElement repositoryTab;

    @FindBy(how = How.ID, using = "menuMdbStudies")
    public WebElement studiesTab;

    public DashBoardPage(WebDriver driver) {
        this.driver = Driver.getDriver();
        PageFactory.initElements(this.driver, this);
    }
}

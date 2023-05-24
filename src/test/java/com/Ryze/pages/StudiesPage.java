package com.Ryze.pages;

import com.Ryze.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StudiesPage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "fdxMdbContainerListItem0MenuToggle")
    public WebElement menuToggle;

    @FindBy(how = How.ID, using = "fdxMdbContainerListItem0View")
    public WebElement viewLink;

    public StudiesPage(WebDriver driver) {
        this.driver = Driver.getDriver();
        PageFactory.initElements(this.driver, this);
    }
}

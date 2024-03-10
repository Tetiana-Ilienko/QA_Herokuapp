package com.herokuapp.pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement JSAlert;

    public AlertsPage clickJSAlert() {
        click(JSAlert);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(xpath = "//*[text()= 'You successfully clicked an alert']")
    WebElement confirmResult;
    public AlertsPage verifyResultAlert(String result) {
        Assert.assertTrue(confirmResult.getText().contains(result));
        return this;
    }




    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement JSConfirm;

    public AlertsPage clickJSConfirm() {
        click(JSConfirm);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(xpath = "//*[text()= 'You clicked: Ok']")
    WebElement confirmResult1;
    public AlertsPage verifyResultConfirm(String result) {
        Assert.assertTrue(confirmResult1.getText().contains(result));
        return this;
    }

    @FindBy(xpath = "//button[text()= 'Click for JS Prompt']")
    WebElement JSPrompt;

    public  AlertsPage clickJsPrompt(String text){
        click(JSPrompt);
        if (text != null) {
            driver.switchTo().alert().sendKeys(text);
            driver.switchTo().alert().accept();
        }
        return this;
    }


    @FindBy(xpath = "//*[text()= 'You entered: I am a JS prompt!']")
    WebElement confirmResult2;
    public AlertsPage verifyResultPrompt(String result) {
        Assert.assertTrue(confirmResult2.getText().contains(result));
        return this;
    }
    }


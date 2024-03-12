package com.herokuapp.pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void click(WebElement element) {
        element.click();
    }


    public void type(WebElement element, String text) {

        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }

    }

    public boolean shouldHaveText(WebElement element, String text, int index) {
        return new WebDriverWait(driver, Duration.ofSeconds(index))
                .until(ExpectedConditions.textToBePresentInElement(element,text));
    }




}

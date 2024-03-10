package com.herokuapp.pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewWindowPage extends BasePage{

    public NewWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@href='/windows/new']")
    WebElement clickHere;

    public NewWindowPage switchToNewWindow(int index) {
        click(clickHere);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(xpath = "//h3")
    WebElement newWindow;

    public NewWindowPage verifyNewWindow(String text) {
        Assert.assertTrue(shouldHaveText(newWindow, text, 5));
        return this;
    }


}

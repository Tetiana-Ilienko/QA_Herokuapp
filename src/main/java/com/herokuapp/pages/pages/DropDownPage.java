package com.herokuapp.pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends HomePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//*[@href='/dropdown']")
    WebElement dropdownlink;

    public DropDownPage clickDropdownLink() {
        click(dropdownlink);
        return this;
    }

    @FindBy(id= "dropdown")
    WebElement dropdown;
    public DropDownPage selectDropdownOption(String value){
        Select select = new Select(dropdown);
        select.selectByValue(value);
        return this;
    }



    public DropDownPage verifyResultDrop(String text) {
        Select select = new Select(dropdown);
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains(text));
        return this;


    }


}

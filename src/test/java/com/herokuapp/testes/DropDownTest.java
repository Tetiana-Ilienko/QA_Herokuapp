package com.herokuapp.testes;

import com.herokuapp.pages.pages.DropDownPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase {


    @BeforeMethod
    public void precondition() {
        new DropDownPage(driver).clickDropdownLink();
    }

    @Test
    public void selectDropdownOptionTest1() {
        new DropDownPage(driver).selectDropdownOption("1").verifyResultDrop("Option 1");
    }

    @Test
    public void selectDropdownOptionTest2() {
        new DropDownPage(driver).selectDropdownOption("2").verifyResultDrop("Option 2");
    }


}

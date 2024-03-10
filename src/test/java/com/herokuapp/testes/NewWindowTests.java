package com.herokuapp.testes;

import com.herokuapp.pages.pages.HomePage;
import com.herokuapp.pages.pages.NewWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTests extends TestBase{


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickNewWindow();
    }

    @Test
    public void selectNewWindowTest() {
        new NewWindowPage(driver).switchToNewWindow(1).verifyNewWindow("New Window");

    }

}

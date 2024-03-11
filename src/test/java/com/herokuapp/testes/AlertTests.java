package com.herokuapp.testes;

import com.herokuapp.pages.pages.AlertsPage;
import com.herokuapp.pages.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickJavaScript();

    }

    @Test
    public void clickJSAlertTest() {
        new AlertsPage(driver).clickJSAlert()
                .verifyResultAlert("You successfully clicked an alert");
    }



    @Test
    public void clickJSConfirmTest() {
        new AlertsPage(driver).clickJSConfirm("Abbrechen")
                .verifyResultConfirm("Cancel");
    }

    @Test
    public void clickJSPromptTest() {
        new AlertsPage(driver);
        new AlertsPage(driver).clickJsPrompt("I am a JS prompt!")
                .verifyResultPrompt("You entered: I am a JS prompt!");
    }
    }



package com.herokuapp.testes;

import com.herokuapp.pages.pages.HomePage;
import com.herokuapp.pages.pages.NewWindowPage;
import com.herokuapp.pages.pages.RedirectionPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectionTest extends TestBase{


    @BeforeMethod
    public void precondition() {
        new RedirectionPage(driver).clickRedirection().clickRedirectLink();
    }

    @Test
    public void checkBrokenLinksTest() {
        new RedirectionPage(driver).clickLinks();

    }
}

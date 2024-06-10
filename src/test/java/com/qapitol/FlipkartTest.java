package com.qapitol;

import com.qapitol.sauron.core.pages.DiService;
import com.qapitol.sauron.report.core.annotations.ReportTest;
import com.qapitol.stepdefinition.HomePage;
import org.testng.annotations.Test;

import com.qapitol.sauron.common.annotations.SauronTest;

@SauronTest
public class FlipkartTest {

    public final HomePage homePage = DiService.get(HomePage.class);

    @SauronTest
    @Test
    @ReportTest("verify user is able to login to application")
    public void verifyUserAbleToUseHomePageApplication() {
        homePage.browserLaunchFlipkart();
        homePage.searchBarFlipkart();
    }
}

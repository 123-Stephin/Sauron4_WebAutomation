package com.qapitol.stepdefinition;

import com.qapitol.sauron.common.configuration.Config;
import com.qapitol.sauron.core.Grid;
import com.qapitol.sauron.data.Data;
import com.qapitol.sauron.report.core.annotations.ReportTestStep;
import com.qapitol.sauron.web.AbstractWebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePage extends AbstractWebPage {


  public static final String URL = "url";
  public static final String SEARCH_BAR = "searchbar";
  public static final String SEARCH_ICON = "searching";
  public static final String SEARCH_ITEM = "item";
  public static final String ADD_TO_CART = "cartload";


  @ReportTestStep("launch flipkart web application")
  public void browserLaunchFlipkart() {
    Grid.driver().get(Config.getConfigProperty(URL));
    Grid.driver().manage().window().maximize();

  }

  @ReportTestStep("search bar in web application")
  public void searchBarFlipkart()
  {

    Assert.assertTrue(waitAndCheckIsElementPresent(SEARCH_BAR));
    waitAndSetText(SEARCH_BAR,"adidas shoes");
    clickUsingJS(locateElement(SEARCH_ICON));
    waitAndClickOn(SEARCH_ITEM);
    sleep(8);
   Grid.switchPlatformContext();
   //Grid.driver().switchTo().activeElement();
      sleep(8);
      //moveToElement(ADD_TO_CART).click();

  }
}

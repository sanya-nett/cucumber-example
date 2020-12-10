package com.ascherba.cucumber.steps;

import com.ascherba.cucumber.pages.MainPage;
import com.ascherba.cucumber.utils.DriverFactory;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by aleksandr.scherba on 09.12.2020
 */
public class MainPageSteps implements En {
    protected WebDriver driver = DriverFactory.getDriver();
    protected MainPage mainPage = new MainPage(driver);

    public MainPageSteps() {
        Given("^Open main page$", () -> {
            mainPage.open();
        });
        Given("^Open auth frame$", () -> {
            mainPage.openSignForm();
        });
        And("^Show \"([^\"]*)\" in header menu$", (String username) -> {
            assertEquals(username, mainPage.getHeaderUserName());
        });
        Then("^Show category \"([^\"]*)\" in header menu$", (String category) -> {
            assertTrue(mainPage.getCategory(category).isDisplayed());
        });
        And("^Category \"([^\"]*)\" has \"([^\"]*)\" link$", (String category, String link) -> {
            WebElement categoryElement = mainPage.getCategory(category);
            assertEquals(link, categoryElement.getAttribute("href"));
        });
        When("^Set \"([^\"]*)\" to email field$", (String email) -> {
            mainPage.setLoginEmailField(email);
        });
        And("^Set \"([^\"]*)\" to password field$", (String password) -> {
            mainPage.setLoginPasswordField(password);
        });
        And("^Click on submit button$", () -> {
            mainPage.clickLoginSubmitButton();
        });
        Then("^Sign form was closed$", () -> {
            mainPage.waitSignFormDisplayStatus(false);
        });
        Then("^Sign form was not closed$", () -> {
            mainPage.waitSignFormDisplayStatus(true);
        });
        After(() -> driver.quit());

    }

}

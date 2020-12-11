package com.ascherba.cucumber.steps;

import com.ascherba.cucumber.pages.FaqPage;
import com.ascherba.cucumber.utils.DriverFactory;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by aleksandr.scherba on 09.12.2020
 */
public class FaqPageSteps implements En {
    protected WebDriver driver = DriverFactory.getDriver();
    protected FaqPage faqPage = new FaqPage(driver);

    public FaqPageSteps() {
        Given("^Open faq page$", () -> {
            faqPage.open();
        });
        When("^Select \"([^\"]*)\" section on the left panel$", (String section) -> {
            faqPage.getTabSection(section).click();
        });
        And("^Click on \"([^\"]*)\" question", (String title) -> {
            faqPage.getQuestionTitle(title).click();
        });
        Then("^Show answer \"([^\"]*)\" under question \"([^\"]*)\"$", (String answer, String title) -> {
            assertEquals(answer, faqPage.getQuestionAnswer(title));
        });
        After(() -> driver.quit());

    }

}

package com.ascherba.cucumber.pages;

import com.ascherba.cucumber.utils.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by aleksandr.scherba on 11.12.2020
 */
public class FaqPage extends PageObject {

    private static final String PAGE_URL = "https://otus.ru/faq/";

    public FaqPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        this.driver.get(PAGE_URL);
    }

    public WebElement getTabSection(String tabSectionText) {
        String tabSectionXPath = String.format("//div[@data-show and contains(text(), '%s')]", tabSectionText);
        return driver.findElement(By.xpath(tabSectionXPath));
    }

    public WebElement getQuestionTitle(String questionTitle) {
        String questionTitleXpath = String.format(
                "//div[contains(@class, 'faq-question__question') and text() = '%s']", questionTitle);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(questionTitleXpath)));
    }

    public String getQuestionAnswer(String questionTitle) {
        WebElement questionTitleElem = getQuestionTitle(questionTitle);
        String answerTextXpath = "./../div[contains(@class, 'faq-question__answer')]";
        WebElement answerTextElem = questionTitleElem.findElement(By.xpath(answerTextXpath));
        return wait.until(ExpectedConditions.visibilityOf(answerTextElem)).getText().trim().replace("\n", "");
    }

}

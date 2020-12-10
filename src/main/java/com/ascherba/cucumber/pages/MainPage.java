package com.ascherba.cucumber.pages;

import com.ascherba.cucumber.utils.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by aleksandr.scherba on 09.12.2020
 */
public class MainPage extends PageObject {

    private static final String PAGE_URL = "https://otus.ru/";

    @FindBy(css = ".header2-menu__item-text__username")
    private WebElement headerUserName;

    @FindBy(css = "button[data-modal-id=new-log-reg]")
    private WebElement authButton;

    @FindBy(css = "div[data-modal-id='new-log-reg']")
    private WebElement signForm;

    // Selectors for signIn/authorization tab
    @FindBy(css = "div[data-mode=login] input[name=email]")
    private WebElement loginEmailField;

    @FindBy(css = "div[data-mode=login] input[name=password]")
    private WebElement loginPasswordField;

    @FindBy(css = "div[data-mode=login] button[type=submit]")
    private WebElement loginSubmitButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        this.driver.get(PAGE_URL);
    }

    public WebElement getCategory(String categoryName) {
        String categoryXPath = String.format("//div[@id='categories_id']//a[@title = '%s']", categoryName);
        return this.driver.findElement(By.xpath(categoryXPath));
    }

    public String getHeaderUserName() {
        return wait.until(ExpectedConditions.visibilityOf(headerUserName)).getText();
    }

    public void openSignForm() {
        authButton.click();
        wait.until(ExpectedConditions.visibilityOf(signForm));
    }

    public void waitSignFormDisplayStatus(boolean displayStatus) {
        if (displayStatus) {
            wait.until(ExpectedConditions.visibilityOf(signForm));
        }
        else {
            wait.until(ExpectedConditions.invisibilityOf(signForm));
        }
    }

    public void setLoginEmailField(String email) {
        wait.until(ExpectedConditions.visibilityOf(loginEmailField)).sendKeys(email);
    }

    public void setLoginPasswordField(String password) {
        wait.until(ExpectedConditions.visibilityOf(loginPasswordField)).sendKeys(password);
    }

    public void clickLoginSubmitButton() {
        loginSubmitButton.click();
    }

}

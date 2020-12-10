package com.ascherba.cucumber.utils;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by aleksandr.scherba on 09.12.2020
 */
public class DriverFactory {

    public static WebDriver getDriver() {
        ChromeDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup();
        return new ChromeDriver();
    }
}

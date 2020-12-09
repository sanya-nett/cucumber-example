package com.ascherba.cucumber.steps;

import io.cucumber.java8.En;

/**
 * Created by aleksandr.scherba on 09.12.2020
 */
public class MainPageSteps implements En {
    public MainPageSteps() {
        Given("^Open main page$", () -> {
        });
        Then("^Show \"([^\"]*)\" in header menu$", (String category) -> {
        });
        And("^Category \"([^\"]*)\" has \"([^\"]*)\" link$", (String category, String link) -> {
        });
        Given("^Open auth frame$", () -> {
        });
        When("^Set \"([^\"]*)\" to email field$", (String email) -> {
        });
        And("^Set \"([^\"]*)\" to password field$", (String password) -> {
        });
        And("^Click on submit button$", () -> {
        });
        Then("^Show Alexander in header menu$", () -> {
        });
        Then("^Show warning tooltip with text: \"([^\"]*)\"$", (String tooltipText) -> {
        });


    }
}

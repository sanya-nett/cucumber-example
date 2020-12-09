package com.ascherba.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by aleksandr.scherba on 09.12.2020
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {
                "pretty",
                "progress",
                "summary"
        }
)
public class CucumberRunnerTest {
}

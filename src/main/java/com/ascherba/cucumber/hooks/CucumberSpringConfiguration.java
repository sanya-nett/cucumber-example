package com.ascherba.cucumber.hooks;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by aleksandr.scherba on 10.12.2020
 */
@ContextConfiguration(classes = SpringConfig.class)
@CucumberContextConfiguration
public class CucumberSpringConfiguration {
}
package com.workflow.newprojectMaven;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources",
            format = {"pretty", "json:target/cucumber.json" },
            tags = {"~@Ignore"},
            strict = false
    )
    public class RunnerTest {

    }


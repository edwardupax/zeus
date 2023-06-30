package com.upax.zeus.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features"}, glue = {"com.upax.zeus.steps"},
        monochrome = true, dryRun = false, publish = false,
        tags = "@livestream",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class MainRunner extends AbstractTestNGCucumberTests {
}

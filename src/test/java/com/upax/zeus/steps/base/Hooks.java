package com.upax.zeus.steps.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.SneakyThrows;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;


import static com.upax.zeus.core.Config.loadConfig;
import static com.upax.zeus.core.DriverFactory.cleanupDriver;
import static com.upax.zeus.core.DriverFactory.getDriver;

public class Hooks {

    @SneakyThrows
    @Before
    public void setup() {
        loadConfig();
        getDriver();
    }

    @AfterStep
    public void captureExceptionImage(Scenario scenario) {
        if (scenario.isFailed()) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliseconds = Long.toString(timestamp.getTime());

            byte[] screenshot = ((TakesScreenshot) getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName() + timeMilliseconds);

        }
    }

    @After
    public void tearDown() {
        cleanupDriver();
    }
}

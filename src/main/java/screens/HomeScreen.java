package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomeScreen {
    private AppiumDriver appiumDriver;

    private By assignments = By.xpath("//android.widget.TextView[@text='Assignments']");
    private By notes = By.xpath("//android.widget.TextView[@text='Notes']");
    private By resources = By.xpath("//android.widget.TextView[@text='Resources']");
    private By profile = By.xpath("//android.widget.TextView[@text='Profile']");


    public HomeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public ProfileScreen navToProfile() {
        appiumDriver.findElement(profile).click();
        return new ProfileScreen(appiumDriver);
    }

    public ProfileScreen navToAssignments() {
        appiumDriver.findElement(assignments).click();
        return new ProfileScreen(appiumDriver);
    }

    public ProfileScreen navToNotes() {
        appiumDriver.findElement(notes).click();
        return new ProfileScreen(appiumDriver);
    }

    public ProfileScreen navToResources() {
        appiumDriver.findElement(resources).click();
        return new ProfileScreen(appiumDriver);
    }
}

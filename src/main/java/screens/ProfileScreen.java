package screens;

import io.appium.java_client.AppiumDriver;
import models.User;

public class ProfileScreen {

    private AppiumDriver appiumDriver;

    public ProfileScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public User getProfileDetails() {
        return new User();
    }
}

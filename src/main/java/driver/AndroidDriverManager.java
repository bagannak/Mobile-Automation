package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverManager implements DriverManager<AppiumDriver> {
    @Override
    public AppiumDriver create(DesiredCapabilities desiredCapabilities) throws MalformedURLException {
        return new AndroidDriver(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
    }
}
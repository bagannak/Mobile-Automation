package driver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public interface DriverManager<Driver> {

    // A new driver comes to life
    Driver create(DesiredCapabilities desiredCapabilities) throws MalformedURLException;
}

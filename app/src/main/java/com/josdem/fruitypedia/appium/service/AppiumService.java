package com.josdem.fruitypedia.appium.service;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;

public interface AppiumService {
    void setCapabilities(DesiredCapabilities capabilities) throws IOException;
}

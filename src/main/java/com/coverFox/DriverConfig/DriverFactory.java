package com.coverFox.DriverConfig;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.coverFox.Utils.Utility;

public class DriverFactory {
	static WebDriver driver = null;

	public static WebDriver initBrowser(String browser)  throws IOException {
		String browserName = Utility.readDataFromPropertiesFile("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(Utility.readDataFromPropertiesFile("url"));
		return driver;

	}

	public static WebDriver getDriver() {
		return driver;
	}
}

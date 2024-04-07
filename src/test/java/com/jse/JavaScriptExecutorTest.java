package com.jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {

	@Test
	public void scrollUpDown() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement playVideoBtn = driver.findElement(By.xpath("(//button[@class='ghpg-play-video-button svg-container dds__button dds__button--primary dds__button--lg'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", playVideoBtn);	
	}
}

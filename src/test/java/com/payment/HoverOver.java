package com.payment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverOver {

	@Test
	public void scrollUpDown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		WebElement signInElement = driver.findElement(By.id("um-si-label"));
		Actions actions = new Actions(driver);
		actions.moveToElement(signInElement).build().perform();

	}
}

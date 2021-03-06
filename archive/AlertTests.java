package com.herokuapp.theinternet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTests {
		@Test
		public void alertdialogTest() {
			// create driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			//sleep for 3 seconds
			sleep(3000);
			
			// maximize browser window
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
			
			Alert alert = driver.switchTo().alert();
			
			//capture the alert message
			String alertMessage = driver.switchTo().alert().getText();
			
			System.out.println(alertMessage);
			sleep(5000);
			
			// maximize browser window
			driver.manage().window().maximize();
		}
		
		private void sleep(long m) {
			try {
				Thread.sleep(m);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
}

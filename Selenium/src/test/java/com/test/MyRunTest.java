package com.test;



import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;




public class MyRunTest {
	// Create instance of PhantomJS driver

	
	/*@Test
	public void runtest() {
		File file = new File("C:/Program Files (x86)/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Guru99");
		element.submit();
		System.out.println("Page title is: " + driver.getTitle());
		driver.quit();*/
	
	@Test
	public void test(){
	WebDriver driver;
	
	FirefoxBinary firefox = new FirefoxBinary(); 
	firefox.setEnvironmentProperty("DISPLAY", ":20"); 
	 driver = new FirefoxDriver(firefox, null);
	 driver.get("https://cybage.atlassian.net/login");
	}
}
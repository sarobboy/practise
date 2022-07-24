package org.JUnit;

import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	static WebDriver driver;
	static long Start;
	
	@Test 
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srvpn\\eclipse-workspace\\JUnit\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();	
		
	}
	@Before
	public void startingTime() {
		System.out.println("Before ");
		Start =System.currentTimeMillis();
	}
	@After
	public void endTime() {
		long end=System.currentTimeMillis();
		System.out.println("Time Taken:"+(end-Start));
	}

	@Test
	public void part1() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void part2() throws Throwable {
		
		
		WebElement m = driver.findElement(By.xpath("(//h2 [@class = 'a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]"));
		Actions a = new Actions(driver);
		a.contextClick(m).perform();
		Robot r = new Robot();
	    r.KeyPress(KeyEvent.VK_DOWN);
	    
		System.out.println("pass");
//		Thread.sleep(2000);
//		WebElement title = driver.findElement(By.xpath("//h1 [@class = 'a-size-large a-spacing-none']"));
//		String name = title.getText();
//		System.out.println(name);
//		
//		System.out.println("part 2");
	}
	
//	@Test
//	public void part3() {
//		System.out.println("part 3");
//	}
//	
//	@Test
//	public void part4() {
//		System.out.println("part 4");
//	}
//	
//	@Test
//	public void part5() {
//		System.out.println("part 5");
//	}
//	
//	@Test
//	public void part6() {
//		System.out.println("part 6");
//	}
}

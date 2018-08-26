package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weight_Watchers {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/selenium/chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	// Navigation
	driver.get("https://www.weightwatchers.com/us/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	// Title verification
	String actualTitle = driver.getTitle();
	String expectedTitle = "Weight Watchers: Weight Loss Program, Recipes & Help | WW America";
	if(actualTitle.equalsIgnoreCase(expectedTitle))
		 System.out.println("Title Matched on Home page");
	else
		 System.out.println("Title didn't match on Home page");
	// Click on find a meeting
	WebElement meeting;
	meeting = driver.findElement(By.className("find-a-meeting"));
	meeting.click();
	Thread.sleep(2000);
	// Title verification on a meeting page
	String actualTitle1 = driver.getTitle();
	if(actualTitle1.contains("Get Schedules & Times Near You"))
		 System.out.println("Title Matched on find meeting page");
	else
		 System.out.println("Title didn't match on find meeting page");
	// entering Zip code 
	WebElement zip, search;
	zip = driver.findElement(By.id("meetingSearch"));
	zip.sendKeys("10011");
	search = driver.findElement(By.className("input-group-btn"));
	search.click();
	Thread.sleep(2000);
	//Getting the first result
	WebElement address, distance;
	address = driver.findElement(By.className("location__name"));
	distance = driver.findElement(By.className("location__distance"));
	System.out.println("Title of first result: "+ address.getText());
	System.out.println("Distance of first result is: "+ distance.getText());
	String add_old = address.getText();
	//System.out.println(add_old);
	address.click();
	Thread.sleep(2000);
	//  Clicked Search result and validation with previous result link
	String address1 = driver.findElement(By.className("location__top")).getText();
	//System.out.println(address1);
	if(add_old.equals(address1)) 
		System.out.println("Both address matches");
	else
	    System.out.println("Address doesnot match");
	// Print day and hours of operations
	WebElement day, hours;
	day = driver.findElement(By.className("hours-list--currentday"));
	System.out.println("Current day & Operation Hours - "+day.getText());
	
	driver.quit();
	}
	}

 
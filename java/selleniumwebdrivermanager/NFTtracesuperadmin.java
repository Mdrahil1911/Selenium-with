package selleniumwebdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NFTtracesuperadmin {
@Test
	public static void nflogin() {
		
        // Initialize the WebDriver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        // Step 1: Open the specific URL
        driver.get("https://app.nfttrace.com/login");
        
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("superadmin@chaincodeconsulting.com");
        
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("admin@123");
        
        WebElement LoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        LoginButton.click();
        
//        WebElement CreateProject = driver.findElement(By.xpath("//button[contains(text(),'Create Project')]"));
//        CreateProject.click();        

        //Accessible Modules
//        WebElement Projects = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[2]/div[1]/span[1]"));
//        Projects.click();
//        
//        WebElement Organizations = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[2]/div[1]"));
//        Organizations.click();
//        
//        WebElement Modeller = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[2]/div[1]/span[1]"));
//        Modeller.click();
//        
//        WebElement Planner = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[2]/div[1]/span[1]"));
//        Planner.click();
        }}

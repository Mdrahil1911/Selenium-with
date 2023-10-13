package selleniumwebdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Doctor {
	

	static String browser;
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        
    }
    
    public static void setbrowser() {
        browser = "firefox";
    }

    // setup browser configuration
    public static void setbrowserconfiguration() {
        if (browser.contains("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.contains("Chrome")) {
            driver = new ChromeDriver();
        }
    }

    // Running application
    public static void urusbeast() {
        driver.get("https://doctor-app.urusbeast.com/login");
    }
    
    public static void Login() {
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys("AD-PImUnreE_bOVMr");
        passwordField.sendKeys("Test@123#");

        WebElement loginButton = driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-button css-1pni1vw']"));
        loginButton.click();
    }
    
    public static void Uploadkeys() {
    	
  	  WebElement chooseFileButton = driver.findElement(By.xpath("//div[@class='style_icon__bOGhi']"));
        String FilePath = "C:\\Users\\MD Rahil\\Downloads\\private_keys (35).json" ;   
        chooseFileButton.sendKeys(FilePath);
        
        WebElement uploadKeysButton = driver.findElement(By.xpath("//div[@class='style_btns__MUy4k flex-row-center']"));
        uploadKeysButton.click();
        
        WebElement close = driver.findElement(By.xpath("//span[contains(text(),'Close')]"));
        close.click();
    }

}
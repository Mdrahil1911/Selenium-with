package selleniumwebdrivermanager;

import java.util.Scanner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginAutomation2 {
	
	static String browser;
	static WebDriver driver;
	
   @BeforeTest
    //Setting up browser
    public static void setbrowser(){
    	browser="Chrome";
    	
    }
    @BeforeTest
    //setup browser configuration
    public static void setbrowserconfiguration() {
    	
    	if(browser.contains("firefox")) {
    		driver = new FirefoxDriver();
    	}
    	if (browser.contains("Chrome")) {
    		driver = new ChromeDriver();
    	}
    }
    
    @Test
    //Running application
    public static void urusbeast() {
    	
    	driver.get("https://admin.urusbeast.com/login");
    }
    
    @Test
    //script for Login page inputs 
    public static void login() {
    	
    	 WebElement usernameField = driver.findElement(By.name("UserNameorEmail"));
    	 WebElement passwordField = driver.findElement(By.name("password"));
    	 
    	 usernameField.sendKeys("AD-lCFWRDnjQy1qMw");
    	 passwordField.sendKeys("Test#123!");
    	 
    	 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    	 loginButton.click();
    }
    @Test
    //upload private keys 
    public static void uploadkey() {
       WebElement chooseFileButton = driver.findElement(By.id("import_private_keys"));
       String FilePath = "C:\\Users\\MD Rahil\\Downloads\\private_keys (12).json" ;
       chooseFileButton.sendKeys(FilePath);
       
       WebElement uploadKeysButton = driver.findElement(By.xpath("//button[contains(text(),'Upload keys')]"));
       uploadKeysButton.click();
    }
    
   @Test
   //Google Authenticator OTP
    public static void gaotp() {
	   
		System.out.println("Please enter the Google Authenticator code generated on your mobile app:");
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int totp = scanner.nextInt(); // Read the OTP entered by the user

        // Enter the OTP into the input field
        WebElement totpField = driver.findElement(By.name("code"));
        totpField.sendKeys(String.valueOf(totp));

        // Click on the submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitButton.click(); // Replace with your logic

        // To check what OTP was entered
        System.out.println("Entered OTP: " + totp);
    }
   

   @Test
   public static void users() {
	   
	   //create user from admin 
	   WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
	   WebElement createuser =driver.findElement(By.xpath("WebElement"));
	   users.click();
	   createuser.click();

	   //create user modal pops up inputs
	   WebElement firstname = driver.findElement(By.name("firstname"));
	   WebElement lastname = driver.findElement(By.name("lastname"));
	   WebElement datepicker = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/span[1]/img[1]"));
	   WebElement bloodgroup = driver.findElement(By.name("blood_group"));
	   WebElement primarynumber = driver.findElement(By.name("country_code"));
	   WebElement primarynuminput = driver.findElement(By.name("primary_contact"));
	   WebElement othernumber = driver.findElement(By.name("other_country_code")); 
	   WebElement othernuminput = driver.findElement(By.name("other_contact"));
	   WebElement age = driver.findElement(By.name("age"));
	   WebElement ssn = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[2]/div[2]/input[1]"));
	   WebElement nationality = driver.findElement(By.name("nationality"));
	   WebElement gender = driver.findElement(By.name("gender"));
	   WebElement primaryemail = driver.findElement(By.name("primary_email"));
	   WebElement otheremail = driver.findElement(By.name("other_email"));
	   WebElement bio = driver.findElement(By.name("bio"));
	   WebElement height = driver.findElement(By.name("height")); //in feets 
	   WebElement weight = driver.findElement(By.name("weight"));  //in kgs
	   WebElement location = driver.findElement(By.name("location"));
	   WebElement department = driver.findElement(By.name("department"));
	   WebElement role = driver.findElement(By.name("role_id"));
	   WebElement experience = driver.findElement(By.name("year_of_experience"));
	   WebElement primaryaddress = driver.findElement(By.name("primary_address"));
	   WebElement otheraddress = driver.findElement(By.name("other_address"));
	   
       //Entering the Fields for create user
	   firstname.sendKeys("md");	   
	   lastname.sendKeys("rahil");	
	   
	   datepicker.click();
	   WebElement dateElement = driver.findElement(By.xpath("WebElement dayElement = driver.findElement(By.xpath(\"//div[contains(text(),'Tu')]\"));"));
	   dateElement.click(); 
       WebElement monthElement = driver.findElement(By.xpath("//span[contains(text(),'July')]")); 
       monthElement.click();
       WebElement yearElement = driver.findElement(By.xpath("//span[contains(text(),'1990')]")); 
       yearElement.click();
       
       Select dropdown2 = new Select(bloodgroup);
	   dropdown2.selectByVisibleText("Option 2");
 
       Select dropdown1 = new Select(primarynumber);
	   dropdown1.selectByVisibleText("IN +91");	   
	   primarynuminput.sendKeys("9535005615");
	   
	   Select dropdown = new Select(othernumber);
	   dropdown.selectByVisibleText("IN +91");	   
	   othernuminput.sendKeys("9535005632");
	 
	   age.sendKeys("25");
	   ssn.sendKeys("123456789");
	   
	   Select dropdown3 = new select(nationality);
	   dropdown3.selectByVisibleText("India");

	   Select dropdown4 = new select(gender);
	   dropdown4.selectByVisibleText("male");
	   
	   primaryemail.sendKeys("md.rahil@chaincodeconsulting.com");
	   otheremail.sendKeys("md.rahil@chaincodeconsulting.com");   
	   bio.sendKeys("Type your bio");
	   height.sendKeys("187");
	   weight.sendKeys("85");
	   location.sendKeys("Banglore");
	   department.sendKeys("Physchopath");
	   
	   select dropdown5 = new select(role);
	   dropdown5.selectByVisibleText("Doctor");
	   
	   experience.sendKeys("5");
	   primaryaddress.sendKeys("Brigade");
	   otheraddress.sendKeys("Whitefield");

   }


	}


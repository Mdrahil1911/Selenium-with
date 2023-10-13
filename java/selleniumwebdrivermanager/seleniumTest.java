package selleniumwebdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Step 1: Open the specific URL
        driver.get("https://admin.urusbeast.com/login");

        // Step 2: Enter username and password
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys("AD-dt9CKYeMw-KpRd");
        passwordField.sendKeys("Test#123!");

        // Step 3: Click on the Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Step 4: Wait for the OTP popup to appear and switch to it
        WebElement otpInputField = driver.findElement(By.id("otp-input"));
        WebElement otpSubmitButton = driver.findElement(By.xpath("//button[text()='Submit']"));

        // Assuming you have a method to generate or retrieve the OTP from Google Authenticator
        String otpValue = retrieveOTPFromAuthenticator(); // Replace with your logic

        // Step 5: Enter the OTP
        otpInputField.sendKeys(otpValue);

        // Step 6: Click on the OTP Submit button
        otpSubmitButton.click();

        // After this step, you should be successfully logged in

        // Close the WebDriver
        driver.quit();
    }

    // Replace this method with your logic to retrieve OTP from Google Authenticator
    private static String retrieveOTPFromAuthenticator() {
        // Implement your logic to get the OTP here
        // This is a placeholder
        return "123456"; // Replace with the actual OTP
    }
}

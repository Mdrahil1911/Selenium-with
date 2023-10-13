package selleniumwebdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class signupdub {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://dev-app.nfttrace.com/register");
        driver.manage().window().maximize();

        // Entering the fields of the signup page
        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("md");

        WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.sendKeys("Rahil");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("md.rahil+1@chaincodeconsulting.com");

        // Verifying email
        WebElement verifyemail = driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='page-top']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]"));
        verifyemail.click();

        // Make an API request to retrieve the OTP
        Response response = RestAssured.get("https://app.nfttrace.com/api/v1/auth/send-email-otp");

        // Check if the response is valid
        if (response.getStatusCode() == 200) {
            // Extract the OTP from the API response
            String otp = response.getBody().toString();
            
            // Now you can use the 'otp' value in your script as needed
            System.out.println("OTP from API: " + otp);
            
            // Fill the OTP field in the web page
            WebElement otpField = driver.findElement(By.id("otpFieldId")); // Replace with actual OTP field locator
            otpField.sendKeys(otp);
        } else {
            System.out.println("API request failed with status code: " + response.getStatusCode());
        }

        // Continue with the rest of your script
        WebElement organizationName = driver.findElement(By.name("organizationName"));
        organizationName.sendKeys("Beauty");
        WebElement phoneNumber = driver.findElement(By.name("phone"));
        phoneNumber.sendKeys("9999999999");

        // Don't forget to close the WebDriver when done
        driver.quit();
    }
}

package selleniumwebdrivermanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forgotpass {
	
	public static void main(String[] args) {
        // Initialize the WebDriver (Firefox in this example)
        WebDriver driver = new FirefoxDriver();

        try {
            // Step 1: Open Gmail and sign in
            driver.get("https://dev-app.nfttrace.com/login");
            driver.manage().window().maximize();
            
            WebElement Forgot = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/span[1]"));
            Forgot.click();
            
//            // Enter your Gmail credentials
            WebElement emailField = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"));
            emailField.sendKeys("md.rahil+para@chaincodeconsulting.com");
            WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
            submit.click();
//
//            // Wait for the password input field to appear
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//            WebElement passwordField = driver.findElement(By.name("password"));
//            passwordField.sendKeys("your_password");
//            WebElement signInButton = driver.findElement(By.id("passwordNext"));
//            signInButton.click();
//
//            // Wait for the inbox to load (you may need to adjust the wait time)
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//            // Step 2: Click on "Forgot Password" email (customize this based on email subject or sender)
//            WebElement forgotPasswordEmail = driver.findElement(By.partialLinkText("Forgot Password")); // Adjust the text as needed
//            forgotPasswordEmail.click();
//
//            // Step 3: Extract the OTP from the email body
//            WebElement emailBody = driver.findElement(By.xpath("//div[@class='a3s aXjCH ']"));
//            String emailText = emailBody.getText();
//
//            // Extract the OTP (you may need to use regular expressions or string manipulation)
//            String otp = extractOTP(emailText);
//
//            // Step 4: Use the OTP as needed (e.g., fill in a form, perform actions, etc.)
//            System.out.println("Retrieved OTP: " + otp);
//
//        } catch (Exception e) {
//            e.printStackTrace();
        } finally {
//            driver.quit();
//        }
//    }
//
//    private static String extractOTP(String emailText) {
//        // Implement a logic to extract the OTP from the email text
//        // You may need to use regular expressions or string manipulation here
//        // For example, if your OTP format is "OTP: 123456", you can extract it like this:
//        // int startIndex = emailText.indexOf("OTP: ") + 5;
//        // int endIndex = emailText.indexOf("\n", startIndex);
//        // return emailText.substring(startIndex, endIndex);
//
//        // Replace the following line with your OTP extraction logic
//        return "123456"; // Replace with your extracted OTP
    }
}
	

}

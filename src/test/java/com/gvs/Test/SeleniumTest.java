package com.gvs.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {

    public static void main(String[] args) {

        // Setup ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
        	 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

             WebDriverWait wait = new WebDriverWait(driver, 10);

             WebElement firstName = wait.until(
                 ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='First Name']"))
             );
             firstName.sendKeys("John");

             driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Doe");
             driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john.doe@example.com");
             driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Password123");
             driver.findElement(By.cssSelector("input[placeholder='Repeat Password']")).sendKeys("Password123");

             // Click Register
             driver.findElement(By.cssSelector("button:contains('Register')")).click();

             System.out.println("Form filled successfully!");
            // Open application URL
            //driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

            // Locate input fields
//            WebElement firstName = driver.findElement(By.name("name"));
//            WebElement lastName = driver.findElement(By.name("lastName"));
//            WebElement email = driver.findElement(By.name("email"));
//            WebElement password = driver.findElement(By.name("password"));
//            WebElement repeatPassword = driver.findElement(By.name("confirmPassword"));

            // Enter values
//            firstName.sendKeys("Giri");
//            lastName.sendKeys("S");
//            email.sendKeys("giri.test@example.com");
//            password.sendKeys("Test@123");
//            repeatPassword.sendKeys("Test@123");

            // Click Register button
            WebElement registerBtn = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
            registerBtn.click();

            System.out.println("Registration form submitted successfully");

        } finally {
            // Close browser
            driver.quit();
        }
    }
}

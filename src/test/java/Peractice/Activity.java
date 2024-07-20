package Peractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();
        wait.until((ExpectedConditions.elementToBeClickable(By.partialLinkText("Create New")))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameInput"))).sendKeys("Ayesha");
        String prefixEmail = "ayesha";
        int number = (int)(Math.random()*50);
        String randomEmail= prefixEmail+number+ "@gmail.com";

        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("emailInput")))).sendKeys(randomEmail);
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("passwordInput")))).sendKeys("1234@Sadaf");
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("confirmPasswordInput")))).sendKeys("1234@Sadaf");
        wait.until((ExpectedConditions.elementToBeClickable(By.className("signup__btn")))).click();

    }}


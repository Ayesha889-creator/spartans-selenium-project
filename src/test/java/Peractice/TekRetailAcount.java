package Peractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TekRetailAcount {
    public static void main(String[] args) throws InterruptedException {



        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");
        String Title = webDriver.getTitle();
        System.out.println(Title);
        By SignIn = By.id("signinLink");
        WebElement Signin = webDriver.findElement(SignIn);
        Signin.click();
        By EnterEmail = By.id("email");
        WebElement enter = webDriver.findElement(EnterEmail);
        enter.sendKeys("lordaltaf@gmail.com");
        By Password = By.id("password");
        WebElement password = webDriver.findElement(Password);
        password.sendKeys("Kabul123@");
        By login = By.id("loginBtn");
        WebElement log = webDriver.findElement(login);
        log.click();








    }





    }



package CrossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.lang.reflect.Type;

public class CrossBrowsing {
    public static void main(String[] args) {
//        EdgeDriver driver= new EdgeDriver();
//        FirefoxDriver driver1 = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.get("https://support.google.com/chrome/");
//        String title = driver.getTitle();
//        System.out.println(title);
//        driver.quit();

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://tek-retail-ui.azurewebsites.net/");
//        driver.manage().window().maximize();
//        driver.getTitle();
//        String title = driver.getTitle();
//         driver.getCurrentUrl();
//         String URL = driver.getCurrentUrl();
//        System.out.println("URL");
//         driver.quit();


        String browserType = "edge";
        WebDriver driver = null;


        if (browserType.equals("edge")) {
            driver = new ChromeDriver();
        } else if (browserType.equals("edge")) {
            driver = new EdgeDriver();
        } else if (browserType.equals("firefox")) {

        } else if (browserType.equals("Safari")) {
            driver = new SafariDriver();
        } else throw new RuntimeException("wrong browsertype");

    

       driver.get("https://support.google.com/chrome/");
       driver.quit();
       driver.manage().window().maximize();

       }
}







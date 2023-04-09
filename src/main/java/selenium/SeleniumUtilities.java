package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumUtilities {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");


//        opt.setExperimentalOption("debuggerAddress", "localhost:9988");
        WebDriver driver = new ChromeDriver(opt);
        // Navigate to the demoqa website
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");

//        driver.quit();
    }

//    driver.findElement(By.className("className"));
//driver.findElement(By.cssSelector(".className"));
//driver.findElement(By.id("elementId"));
//driver.findElement(By.linkText("linkText"));
//driver.findElement(By.name("elementName"));
//driver.findElement(By.partialLinkText("partialText"));
//driver.findElement(By.tagName("elementTagName"));
//driver.findElement(By.xpath("xPath"));

}

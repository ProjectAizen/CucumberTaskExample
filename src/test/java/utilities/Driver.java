package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    //private static int timeout=5;

    private Driver() {

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {

        if (driver != null) {

            driver.close();
            driver = null;
        }


    }

    public static void navigateToUrl(String property) {
    }

    // public static void waitAndClick(WebElement element) throws InterruptedException {
    //     for (int i = 0; i < timeout; i++) {
    //         try {
    //             element.click();
    //             return;
    //         } catch (WebDriverException e) {
//
    //         }
    //     }
//
//
    // }
    // public static void clickWithJS(WebElement element) {
    //     ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    //     ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    // }
}










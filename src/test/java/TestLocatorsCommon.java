import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLocatorsCommon {

    WebDriver driver;

    @BeforeClass
    public void preconditions() {
        // if the driver in the folder tools or in the project (need to update driver if chrome update)
                driver = new ChromeDriver();

//        driver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);

        // old version for the WebDriverManager for chrome
//        ChromeOptions chromeOptions = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(chromeOptions);

        // new version for WDM chrome
        //    driver = WebDriverManager.chromedriver().create();

        // old version for the WebDriverManager for firefox
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver(firefoxOptions);

        // new version for WDM firefox
    //    driver = WebDriverManager.firefoxdriver().create();


        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
    }

    @Test
    public void some() throws InterruptedException {

        System.out.println(driver.findElement(By.xpath("//h1[@class='title']")).getText());

        WebElement elementTerms = driver.findElement(By.partialLinkText("Terms of use"));
        elementTerms.click();
        Thread.sleep(5000);

        WebElement elementSearch = driver.findElement(By.partialLinkText("Search"));
        elementSearch.click();
        Thread.sleep(5000);


    }

    @Test
    public void some1() {

    }

    @Test
    public void some2() {

    }

    @AfterClass
    public void exit() {
        driver.quit();
    }


}

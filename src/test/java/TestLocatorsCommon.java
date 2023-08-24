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

                driver = new ChromeDriver();
//        ChromeOptions chromeOptions = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(chromeOptions);

//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver(firefoxOptions);
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

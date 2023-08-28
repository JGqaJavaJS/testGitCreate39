import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SecondTestLocators {

    WebDriver driver;

    @BeforeClass
    public void preconditions() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void testSome() {
        WebElement elementTerms = driver.findElement(By.partialLinkText("Terms of use"));
        elementTerms.click();
        WebElement elementSearch = driver.findElement(By.partialLinkText("Search"));
        elementSearch.click();
        System.out.println("by class " + driver.findElement(By.className("subtitle")).getText());
        System.out.println("by css also class " + driver.findElement(By.cssSelector(".subtitle")).getText());//# id  . class
        System.out.println("value city " + driver.findElement(By.id("city")).getAttribute("id"));
       // System.out.println("by name " + driver.findElement(By.name("")));
        System.out.println("style=touch-action: " + driver.findElement(By.tagName("div")).getAttribute("style"));
    }

    @Test
    public void xpathTests() {
        WebElement elementTerms = driver.findElement(By.xpath("//a[text()=' Terms of use ']"));
        elementTerms.click();
        WebElement elementSearch =
                driver.findElement(By.xpath("//div[@class='header']//a[contains(text(),'Sear')]"));
        elementSearch.click();
        System.out.println("by class " + driver.findElement(By.xpath("//h2[@class='subtitle']")).getText());
        System.out.println("input label " +
                driver.findElement(By.xpath("//label[@for='city']")).getAttribute("class"));
        // System.out.println("by name " + driver.findElement(By.name("")));
        System.out.println("style=touch-action: " +
                driver.findElement(By.xpath("//div")).getAttribute("style"));
        System.out.println("style=touch-action: " +
                driver.findElement(By.xpath("//div/a//..")).getAttribute("style"));
    }

    @AfterClass
    public void exit() {
        driver.quit();
    }
}

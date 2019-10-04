import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverController {
    private static WebDriver driver;
    public static WebElement element;
    public static Wait<WebDriver> wait;

    public static WebDriver getDriver() {
        return driver;
    }


    @Before
    public void startWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10, 2000);
        driver.get("http://www.sberbank.ru/ru/person");
    }

    @After
    public void closeDriver() {
        //driver.close();
    }

    public void clickElementByPath(String xpath) {
        element = driver.findElement(By.xpath(xpath));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        element.click();
    }

    public void checkTheTitle (String title) {
        Assert.assertNotEquals("Заголовок страхования не совпадает с ожидаемым", title, driver.getTitle());
    }

    public void inputData (String xpath, String data){
        element = driver.findElement(By.xpath(xpath));
        element.sendKeys(data);
    }

    public void checkData (String xpath, String expected) {
        Assert.assertEquals(driver.findElement(By.xpath(xpath)).getAttribute("value"), expected);
    }

}

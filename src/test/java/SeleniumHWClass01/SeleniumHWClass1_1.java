package SeleniumHWClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHWClass1_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/" +
                   "register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Oleg");
        driver.findElement(By.name("customer.lastName")).sendKeys("Min");
        driver.findElement(By.id("customer.address.street")).sendKeys("12345 SE Walnut st");
        driver.findElement(By.id("customer.address.city")).sendKeys("Miami");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("21365");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7899");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-123-123");
        driver.findElement(By.name("customer.username")).sendKeys("nhd1254");
        driver.findElement(By.id("customer.password")).sendKeys("hds12546");
        driver.findElement(By.name("repeatedPassword")).sendKeys("hds12546");
        Thread.sleep(5000);
        driver.quit();
    }
}

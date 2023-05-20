package SeleniumHWClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHWClass2_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Smith");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("hfjdiw");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("oyiut1233");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("June");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1965");
        WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
        gender.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();
















        //input[@name='abra']
        //tagname[text()='text value']
        //input[contains(@email,'how are you')]
    }
}

package SeleniumHWClass04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDOBFacebook extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement r1 = driver.findElement(By.xpath("//a[text()='Create new account']"));
        r1.click();
        Thread.sleep(4000);
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select sel = new Select(month);
        sel.selectByValue("8");
        WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select selDay = new Select(day);
        selDay.selectByValue("7");
        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selYear = new Select(year);
        selYear.selectByIndex(48);
    }
}

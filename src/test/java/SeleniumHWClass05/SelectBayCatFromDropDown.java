package SeleniumHWClass05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectBayCatFromDropDown extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//b[text()='Animals :']"));
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement txtBox=driver.findElement(By.xpath("//input"));
        txtBox.sendKeys("Baby Cat");

        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();



    }
}

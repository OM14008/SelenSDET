package SeleniumHWClass04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTuesday extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url= "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(4000);
        WebElement days= driver.findElement(By.xpath("//select[@class='form-control']"));
        Select sel = new Select(days);
        sel.selectByIndex(3);
        Thread.sleep(4000);
        sel.selectByVisibleText("Thursday");
        Thread.sleep(4000);
        sel.selectByValue("Friday");
    }
}

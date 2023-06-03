package SeleniumHWClass05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LastAlert extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement element = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        element.click();
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.sendKeys("abracadabra");
        Thread.sleep(4000);
        confirmationAlert.accept();
        Thread.sleep(4000);
        driver.quit();
    }
}

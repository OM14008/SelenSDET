package SeleniumHWClass06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PrintUser extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement getNewUser=driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUser.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20) );
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
                ("//div[@id='First-Name']"),"First Name"));

        WebElement firstName=driver.findElement(By.xpath("//div[@id='First-Name']"));
        System.out.println(firstName.getText());





    }
}

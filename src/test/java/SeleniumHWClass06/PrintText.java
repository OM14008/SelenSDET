package SeleniumHWClass06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class PrintText extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

        WebElement startBtn=driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20) );
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
                ("//h4[text()='Welcome Syntax Technologies']"),"Welcome Syntax Technologies"));
        WebElement txt=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(txt.getText());
    }
}

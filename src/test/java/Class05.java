import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Class05 {
    public class Frames extends CommonMethods {

            public static void main(String[] args) throws InterruptedException {
                String url="https://chercher.tech/practice/frames";
                String browser="chrome";
                openBrowserAndLaunchApplication(url,browser);

//            task1: print animal on screen
//            and select Babycat from drop down

//    Step1:        as the webElement is inside an iframe
//            first we need to switch to it
                driver.switchTo().frame(1);
//            find the WebElement animal
                WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
                System.out.println(animal.getText());
//            select baby cat
                WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
                Select sel =new Select(dd);
                sel.selectByVisibleText("Baby Cat");

//            switch the focus to the main page
                driver.switchTo().defaultContent();

//            switch to frame containing text box
                driver.switchTo().frame("frame1");
                WebElement textBox = driver.findElement(By.xpath("//input"));
                textBox.sendKeys("abracadabra");
//            click on the checkBox
//            switch to frame using webElement method
              WebElement frame3= driver.findElement(By.xpath("//frame[@id='frame3']"));
              driver.switchTo().frame(frame3);

              driver.findElement(By.id("a")).click();


            }
        }
    }


package Class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement r1=driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        r1.click();
        boolean r1IsSelected=r1.isSelected();
        System.out.println("The radio button Male is selected: "+r1IsSelected);
        boolean r1IsDisplayed=r1.isDisplayed();
        System.out.println("The radio button Male is displayed: "+r1IsDisplayed);
        boolean r1IsEnabled=r1.isEnabled();
        System.out.println("The radio button Male is enabled: "+r1IsEnabled);
        WebElement r2=driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();
        r1IsSelected=r1.isSelected();
        System.out.println("The male radio button is selected: "+r1IsSelected);













    }
}

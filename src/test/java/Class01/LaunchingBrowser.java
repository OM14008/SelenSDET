package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //use .get(url) to navigate to the desired url
        driver.get("https://www.google.com");
        //maximize a window
        driver.manage().window().maximize();
        //get current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url of the website is : "+currentUrl);

        //get the title of the page
        String title=driver.getTitle();
        //printing the title to the console
        System.out.println("The title of the page is : "+title);
        // add some wait time
        Thread.sleep(5000);
        //close the web browser
        driver.quit();


    }
}

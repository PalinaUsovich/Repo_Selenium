package Trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "/Users/palina/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

    }

}

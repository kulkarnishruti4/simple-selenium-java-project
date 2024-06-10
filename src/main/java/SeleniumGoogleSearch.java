

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumGoogleSearch {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();

        try {
            // Open Google
            driver.get("https://www.google.com");

            // Find the search box
            WebElement searchBox = driver.findElement(By.name("q"));

            // Type "hello" in the search box
            searchBox.sendKeys("hello");

            // Optionally, submit the search form
            searchBox.submit();

            // Wait for a few seconds to observe the result
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

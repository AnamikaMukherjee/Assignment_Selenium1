package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class UseCaseList {

    public void storeAndShowAllLinks(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        ArrayList<String> linkTexts = new ArrayList<>();
        ArrayList<String> url = new ArrayList<>();

        for (WebElement link : links) {
            String text = link.getText().trim();
            String urlText = link.getAttribute( "href");
            if (!text.isEmpty()) {
                linkTexts.add(text);
                url.add(urlText);
            }
        }

        for (String linkText : linkTexts) {
            System.out.println(linkText);
        }

        for (String urlTexts : url) {
            System.out.println(urlTexts);
        }
    }
        public static void main(String[] args) {
            UseCaseList odd = new UseCaseList();
            WebDriver driver = new ChromeDriver();
            odd.storeAndShowAllLinks(driver);
        }

}

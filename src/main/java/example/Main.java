package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;




public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            String tittle = driver.getTitle();
            System.out.println(tittle);



        if (title.equals("Google")) {
            System.out.println("Title matches expected value: 'Google'");
        } else {
            System.out.println("Title does not match. Expected 'Google', but got: " + title);
        }
try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
    throw new RuntimeException(e);
}
            driver.quit();


    }
}
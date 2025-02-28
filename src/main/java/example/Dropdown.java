package example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
    public void DropdownInterect(WebDriver driver){
        System.out.println("DropdownInterect");
        Select dropdown = new Select (driver.findElement(By.id("dropdown")));
    }

    public static void main(String[] args) throws InterruptedException {
        Dropdown a = new Dropdown();
        WebDriver driver = new ChromeDriver();
        a.DropdownInterect(driver);
    }
}

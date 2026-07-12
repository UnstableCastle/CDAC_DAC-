import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebLocators {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            i++;

            WebDriver driver = new EdgeDriver();

            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.name("login-button")).click();

            driver.quit();
        }
        System.out.println(i);
    }
}
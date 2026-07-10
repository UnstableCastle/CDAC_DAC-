import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).submit();
		driver.manage().window().maximize();
		driver.switchTo().alert().dismiss();

	}

}














import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practical {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com");


		driver.manage().window().maximize();


		driver.findElement(By.name("q")).sendKeys("unstablecastle");
		driver.findElement(By.name("btnK")).submit();

	}
}
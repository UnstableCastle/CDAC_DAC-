import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practical {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		try {
			
		
		driver.get("https://www.google.com");

		Thread.sleep(5000);
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("rainbow");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(5000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
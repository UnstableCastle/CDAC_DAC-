import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	driver = new EdgeDriver();
		driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("@unstablecastle");
		driver.findElement(By.xpath("M19 6.41L17")).click();
		driver.findElement(By.name("btnK")).click();
		
	}

}

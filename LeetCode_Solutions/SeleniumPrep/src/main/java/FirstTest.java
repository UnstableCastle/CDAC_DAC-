import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	  public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        try {
	            System.out.println("Navigating to website...");
	            driver.get("https://the-internet.herokuapp.com/");
	            
	            String pageTitle = driver.getTitle();
	            System.out.println("The page title is: " + pageTitle);
	            
	            if (pageTitle.equals("The Internet")) {
	                System.out.println("TEST PASSED: Title matches!");
	            } else {
	                System.out.println("TEST FAILED: Incorrect title.");
	            }
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            System.out.println("Closing browser...");
	            driver.quit(); 
	        }
	    }
}
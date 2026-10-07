import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        
        // 1. Initialize the WebDriver (This opens a blank Chrome window)
        WebDriver driver = new ChromeDriver();
        
        try {
            // 2. Navigate to a test website
            System.out.println("Navigating to website...");
            driver.get("https://the-internet.herokuapp.com/");
            
            // 3. Grab the title of the web page
            String pageTitle = driver.getTitle();
            System.out.println("The page title is: " + pageTitle);
            
            // 4. Our First "Test" (Assertion)
            if (pageTitle.equals("The Internet")) {
                System.out.println("TEST PASSED: Title matches!");
            } else {
                System.out.println("TEST FAILED: Incorrect title.");
            }
            
            // Optional: Pause for 3 seconds just so you can see it with your human eyes
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 5. Always close the browser to free up memory
            System.out.println("Closing browser...");
         //   driver.quit(); 
        }
    }
}
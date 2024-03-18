import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week5cmrit {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\CMRCP\\Downloads\\chromedriver-win64 (8)\\chromedriver-win64");
	WebDriver driver = new ChromeDriver();
	driver.get("https://cmrithyderabad.edu.in/");
	driver.manage().window().maximize();
	WebElement Examination=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div/div/div/nav[1]/ul/li[4]/a"));
	Examination.click();
	WebElement Results=driver.findElement(By.partialLinkText("Results"));
	Results.click();
}
}

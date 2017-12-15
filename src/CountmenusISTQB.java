import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountmenusISTQB 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(20000);
		driver.get("http://testyantra.com");
		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
	    System.out.println(elements.size());
	    System.out.println();
	    System.out.println(elements.size());
	}
}

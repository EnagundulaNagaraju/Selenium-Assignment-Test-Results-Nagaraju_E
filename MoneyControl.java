package AssessmentExam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement stocks=driver.findElement("By.xpath("//link[@className='link1'])");

	}

}

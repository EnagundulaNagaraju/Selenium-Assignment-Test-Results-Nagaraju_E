package AssessmentExam;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataTablesTest {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Open Website
		driver.get("https://datatables.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Selecting dropdown value
		WebElement dropDownBox=driver.findElement(By.name("example_length"));
		
		Select select=new Select(dropDownBox);
		select.selectByValue("50");
		
		//list of values from table 
		List<WebElement> tableRows=(List<WebElement>) driver.findElement(By.xpath("//table[@id='example']/tbody/tr"));
		
		//Finding table size
		int tableSize=tableRows.size();
		
		System.out.println(tableSize);
		
		//Running loop to find age of employees and salary
		for(int i=1;i<=tableSize;i++)
		{
			WebElement namesList=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td["+i+"]"));
			namesList.click();
			String employeeNames=namesList.getText();
			
			WebElement ageList=driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td["+(i+3)+""));
			String ageOfEmploye=ageList.getText();
			int ageOfEmployee=Integer.parseInt(ageOfEmployee);
			if(ageOfEmployee>50) {
				System.out.println(employeeNames);
			}
			
			
		}
		
		
		
		
		
	}

}

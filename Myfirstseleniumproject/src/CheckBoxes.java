import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//1) select specific checkbox
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2)Select all the checkboxes\
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
			}
			*/
		//3) Select last 3 checkboxes
		//total no of checkboxes - how many checkboxes want to select = starting index
		//7-3 = 4(starting index)
		/*for(int i= 4; i<checkboxes.size(); i++) 
		{
			checkboxes.get(i).click();
			
		}*/
		//4)select first three checkboxes
		/*for(int i =0; i<3; i++) {
			
			checkboxes.get(i).click();
		}*/
		//5)unselect checkboxes if they are selected
		for(int i =0; i<3; i++) {
			
        	   checkboxes.get(i).click(); 
           }
		Thread.sleep(5000);
		for(int i =0; i<checkboxes.size(); i++) {
			
			if (checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
			
		
        }

	
}
}

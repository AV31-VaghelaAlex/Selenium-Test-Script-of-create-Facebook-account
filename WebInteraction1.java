package MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebInteraction1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		//Handle Text box
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("wxyzs");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("abcde");
		Thread.sleep(1000);

		
		//Handle dropdown
		WebElement day = driver.findElement(By.cssSelector("#day"));
		Select s=new Select(day);
		Thread.sleep(2000);
		s.selectByIndex(20);
		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.cssSelector("#month"));
		Select s1 = new Select(month);
		Thread.sleep(2000);
		s1.selectByValue("2");
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.cssSelector("#year"));
		Select s2 = new Select(year);
		Thread.sleep(2000);
		s2.selectByVisibleText("1974");
		
		Thread.sleep(1000);
		
		//Handle radio button
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//handle text box 
		driver.findElement(By.name("reg_email__")).sendKeys("abced@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1bc3dsf4");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Thread.sleep(5000);
		//driver.close();
	}

}

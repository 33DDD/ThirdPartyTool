package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeEmail {
	
	public WebDriver driver = null;
	//public static String Chrome_Key="webdriver.chrome.driver";
	//public static String Chrome_Value = "C:\\Users\\Owner\\eclipse-workspace\\ThirdPartyToolDemo\\driveme\\chromedriver.exe";
	public WebDriverWait wait = null;
	@BeforeMethod
	public void precondition(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\ThirdPartyToolDemo\\driveme\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void RunAutoIT(){
		
		try {
			
			String strFilePath = "C:\\Users\\Owner\\Desktop\\SampleText.txt";
			String strPath = "C:\\Users\\Owner\\Desktop\\Attachment.exe";
			String strParameter = strPath+""+strFilePath;
			Runtime.getRuntime().exec(strParameter);
			
		} catch (Exception e)
		{
			System.out.println("Unable to upload the attachment");
		}
	}
	
	@Test
	public void composeEmailAttachment(){
		
		//WebElement gmail = driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div[1]/div/div[1]/a"));
		//gmail.click();
		WebElement sign = driver.findElement(By.xpath("//*[@id='gb']/div/div[2]/a"));
		sign.click();
		WebElement Username = driver.findElement(By.id("identifierId"));
		Username.sendKeys("aklly36@gmail.com");
		WebElement next = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]"));
		next.click();
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("dre270and655");
		WebElement nextone = driver.findElement(By.xpath("//*[@id='passwordNext']/div/button"));
		nextone.click();
		wait.until(ExpectedConditions.titleContains("Inbox"));
		WebElement composeBtn = driver.findElement(By.xpath("//*[@id=':kr']/div/div"));
		composeBtn.click();
		RunAutoIT();
		
		
	}
	
	//@AfterMethod
	//public void closeBrowser(){
		//driver.close();
	}
	


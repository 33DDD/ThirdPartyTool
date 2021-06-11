package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToFacebook {
	
	public WebDriver driver;
	//public static String Chrome_Key="webdriver.chrome.driver";
	//public static String Chrome_Value = "C:\\Users\\Owner\\eclipse-workspace\\ThirdPartyToolDemo\\driveme\\chromedriver.exe";
	
	
	@BeforeMethod
	public void precondition(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\ThirdPartyToolDemo\\driveme\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginToFacebook() throws FindFailed{
		
		Screen screen = new Screen();	
		Pattern LoginExbtn = new Pattern("C:\\Users\\Owner\\Downloads\\Sikuli\\LoginExbtn.png");
		Pattern Username = new Pattern("C:\\Users\\Owner\\Downloads\\Sikuli\\Username.png");
		Pattern Password = new Pattern("C:\\Users\\Owner\\Downloads\\Sikulis\\Password.png");
		Pattern Login = new Pattern("C:\\Users\\Owner\\Downloads\\Sikuli\\Login.png");
		
		screen.wait(LoginExbtn,10);
		screen.click(LoginExbtn);
		screen.wait(Username,10);
		screen.type(Username,"byreress");
		screen.type(Password,"123byreress");
		screen.click(Login);
		
		
	}

}

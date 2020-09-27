package sikuli_projectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class BasicAuthPopup {
	public static void main(String[] args) throws FindFailed {
		
		System.setProperty("webdriver","C:\\Selenium\\Drivers\\Chrome\\ChromeDriver\\chromedriver.exe");
		String filePath = "C:\\Selenium\\Practice\\Sikuli\\BasicAuthPopup\\";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Screen s = new Screen();
		
		Pattern username = new Pattern(filePath + "UsernameTextBox.PNG");
		Pattern password = new Pattern(filePath + "Password.PNG");
		Pattern signin = new Pattern(filePath + "Signin.PNG");
		Pattern cancel = new Pattern(filePath + "Cancel.PNG");
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		//driver.findElement(By.xpath("//*[@href=\"/basic_auth\"]")).click();
		//s.click(signin);
		s.wait(signin, 20);
		//s.click(cancel);
		
		
		//s.wait(username, 20);
		s.type(username, "Username");
		s.type(password, "password");
		s.click(signin);
		s.click(cancel);
			
		
		
		
	}
	
	
	
	

}

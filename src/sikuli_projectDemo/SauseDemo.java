package sikuli_projectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SauseDemo {
	
	public static void main(String[] args) throws FindFailed {
		
		System.setProperty("webdriver","C:\\Selenium\\Practice\\sikuli_project\\bin\\sikuli_projectDemo\\drivers\\chromedriver.exe");
		WebDriver driver;
		
		
		String filePath = "C:\\Selenium\\Practice\\sikuli_project\\bin\\sikuli_projectDemo\\Sikuli\\SauseDemo\\";
		
		//String loginButton = "Login.PNG";
		//String userName = "userName.PNG";
		//String password = "password.PNG";
		
		Screen s = new Screen();
	
		Pattern loginButton = new Pattern(filePath + "Login.PNG");
		Pattern userName = new Pattern(filePath + "userName.PNG");
		Pattern password = new Pattern(filePath +"password.PNG");
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		s.wait(userName, 20);
		s.type(userName, "Username");
		s.type(password, "Password");
		s.click(loginButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
